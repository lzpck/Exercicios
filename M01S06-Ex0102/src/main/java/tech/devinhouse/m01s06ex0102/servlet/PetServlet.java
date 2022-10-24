package tech.devinhouse.m01s06ex0102.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tech.devinhouse.m01s06ex0102.models.Pet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/pet")
public class PetServlet extends HttpServlet {

    private static List<Pet> pets = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (Pet pet: pets) {
            resp.getWriter().println(pets);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String tipo = req.getParameter("tipo");
        String raca = req.getParameter("raca");

        Pet pet = Pet.builder()
                .nome(nome)
                .tipo(tipo)
                .raca(raca)
                .build();
        pets.add(pet);
        resp.getWriter().println(pets);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String tipo = req.getParameter("tipo");
        String raca = req.getParameter("raca");
        Integer id = Integer.valueOf(req.getParameter("id"));

        Pet pet = findById(id);
        pet.setNome(nome);
        pet.setTipo(tipo);
        pet.setRaca(raca);

        resp.getWriter().println(pets);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Boolean sucesso = true;
        try {
            Integer id = Integer.valueOf(req.getParameter("id"));
            Pet pet = findById(id);

            pets.remove(pet);
        } catch (Exception e){
            sucesso = false;
        }
        resp.getWriter().println(sucesso);
    }

    private Pet findById (Integer id){
        for (Pet pet: pets) {
            if (id.equals(pets.get(id))){
                return pet;
            }
        }
        return null;
    }
}
