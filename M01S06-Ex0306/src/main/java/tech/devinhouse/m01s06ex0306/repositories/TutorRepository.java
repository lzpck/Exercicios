package tech.devinhouse.m01s06ex0306.repositories;

import org.springframework.stereotype.Repository;
import tech.devinhouse.m01s06ex0306.models.Tutor;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TutorRepository {
    private static int sequencia = 0;
    private static List<Tutor> tutors = new ArrayList<>();

    public Tutor save(Tutor tutor){
        if (tutor.getId() == null){
            tutor.setId(generateId());
            tutors.add(tutor);
            return tutor;
        }
        Tutor tutorEditar = findById(tutor.getId());
        tutorEditar.setNome(tutor.getNome());
        return tutorEditar;
    }

    public Tutor findById(Integer id) {
        for (Tutor tutor : tutors){
            if (id == tutor.getId()){
                return tutor;
            }
        }
        return null;
    }

    public List<Tutor> findAll(){
        return tutors;
    }

    public boolean delete(Integer id){
        try {
            Tutor tutor = findById(id);
            tutors.remove(tutor);
        } catch (Exception e){
            return false;
        }
        return true;
    }


    private Integer generateId() {
        return ++sequencia;
    }
}
