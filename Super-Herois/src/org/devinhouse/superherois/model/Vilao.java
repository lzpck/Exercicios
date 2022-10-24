package org.devinhouse.superherois.model;

public class Vilao extends Personagem{
    protected Integer tempoDePrisao;

    public Vilao(String nome, String superPoder, Integer tempoDePrisao) {
        super(nome, superPoder);
        this.tempoDePrisao = tempoDePrisao;
    }
}
