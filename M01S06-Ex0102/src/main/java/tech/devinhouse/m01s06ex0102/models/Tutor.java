package tech.devinhouse.m01s06ex0102.models;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
public class Tutor {

    private static Integer sequencia = 0;
    private Integer id;
    private String nome;

    public Tutor(Integer id, String nome) {
        this.id = generateId();
        this.nome = nome;
    }

    public Tutor(){
        this.id = generateId();
    }

    private Integer generateId(){
        return ++sequencia;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
