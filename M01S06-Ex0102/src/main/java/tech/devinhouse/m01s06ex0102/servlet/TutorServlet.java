package tech.devinhouse.m01s06ex0102.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tech.devinhouse.m01s06ex0102.models.Tutor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/tutor")
public class TutorServlet extends HttpServlet {

    private List<Tutor> tutores = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (Tutor tutor: tutores) {
            resp.getWriter().println(tutor);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");

        Tutor tutor = Tutor.builder()
                .nome(nome)
                .build();
        tutores.add(tutor);
        resp.getWriter().println(tutor);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        Integer id = Integer.valueOf(req.getParameter("id"));

        Tutor tutor = findById(id);
        tutor.setNome(nome);

        resp.getWriter().println(tutor);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Boolean sucesso = true;
        try {
            Integer id = Integer.valueOf(req.getParameter("id"));
            Tutor tutor = findById(id);

            tutores.remove(tutor);
        } catch (Exception e){
            sucesso = false;
        }
        resp.getWriter().println(sucesso);
    }

    private Tutor findById (Integer id){
            for (Tutor tutor: tutores) {
            if (id.equals(tutor.getId())){
                return tutor;
            }
        }
        return null;
    }
}
