package org.devinhouse.superherois.model;

public class Heroi extends Personagem{
    protected String nomeVidaReal;

    public Heroi(String nome, String superPoder, String nomeVidaReal) {
        super(nome, superPoder);
        this.nomeVidaReal = nomeVidaReal;
    }
}
