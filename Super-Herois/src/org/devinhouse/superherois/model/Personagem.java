package org.devinhouse.superherois.model;

public abstract class Personagem implements Comparable<Personagem>{
    protected String nome;
    protected String superPoder;

    public Personagem(String nome, String superPoder) {
        this.nome = nome;
        this.superPoder = superPoder;
    }

    @Override
    public String toString() {
        return "Personagem - " +
                "[Nome: '" + nome + '\'' +
                ", Super Poder: '" + superPoder + '\'' +
                '}';
    }

    public int compareTo(Personagem ordem) {
        return this.getNome().compareTo(ordem.getNome());
    }

    public boolean equals(Object ordem) {
        if (this == ordem) return true;
        if (ordem == null || getClass() != ordem.getClass()) return false;
        Personagem that = (Personagem) ordem;
        return nome.equals(that.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }
}
