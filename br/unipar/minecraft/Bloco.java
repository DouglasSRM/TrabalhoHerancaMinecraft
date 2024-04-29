package br.unipar.minecraft;

public class Bloco extends Item{
    private int[] dimensaoXYZ;
    private String colisao;

    public int[] getDimensaoXYZ() {
        return dimensaoXYZ;
    }

    public void setDimensaoXYZ(int[] dimensaoXYZ) {
        this.dimensaoXYZ = dimensaoXYZ;
    }

    public String getColisao() {
        return colisao;
    }

    public void setColisao(String colisao) {
        this.colisao = colisao;
    }
}
