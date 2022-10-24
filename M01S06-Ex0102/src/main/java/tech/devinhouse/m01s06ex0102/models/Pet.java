package tech.devinhouse.m01s06ex0102.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {

    private static int sequencia = 0;
    private Integer id;
    private String nome;
    private String tipo;
    private String raca;

    public Pet(Integer id, String nome, String tipo, String raca) {
        this.id = generateId();
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
    }

    public Pet(){
        this.id = generateId();
    }

    private Integer generateId(){
        return ++sequencia;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
