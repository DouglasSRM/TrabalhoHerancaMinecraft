package br.unipar.minecraft;

public class Bioma {

    private String nome;
    private Estruturas[] estrutura;
    private Bloco[] bloco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estruturas[] getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(Estruturas[] estrutura) {
        this.estrutura = estrutura;
    }

    public Bloco[] getBloco() {
        return bloco;
    }

    public void setBloco(Bloco[] bloco) {
        this.bloco = bloco;
    }
}
