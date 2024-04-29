package br.unipar.minecraft;

public class CriaturaPassiva extends Criaturas{

    private String condicaoCruzar;
    private String reacaoAoAtaque;

    public String getCondicaoCruzar() {
        return condicaoCruzar;
    }

    public void setCondicaoCruzar(String condicaoCruzar) {
        this.condicaoCruzar = condicaoCruzar;
    }

    public String getReacaoAoAtaque() {
        return reacaoAoAtaque;
    }

    public void setReacaoAoAtaque(String reacaoAoAtaque) {
        this.reacaoAoAtaque = reacaoAoAtaque;
    }
}
