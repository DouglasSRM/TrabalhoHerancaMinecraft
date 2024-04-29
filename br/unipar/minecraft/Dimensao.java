package br.unipar.minecraft;

public class Dimensao {
    private String nome;
    private Bioma[] bioma;
    private int limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bioma[] getBioma() {
        return bioma;
    }

    public void setBioma(Bioma[] bioma) {
        this.bioma = bioma;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
}
