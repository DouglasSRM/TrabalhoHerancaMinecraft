package br.unipar.minecraft;

public class Criaturas extends Entidade{
    private int id;
    private Bioma[] bioma;
    private ItemGenerico[] drop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bioma[] getBioma() {
        return bioma;
    }

    public void setBioma(Bioma[] bioma) {
        this.bioma = bioma;
    }

    public ItemGenerico[] getDrop() {
        return drop;
    }

    public void setDrop(ItemGenerico[] drop) {
        this.drop = drop;
    }
}
