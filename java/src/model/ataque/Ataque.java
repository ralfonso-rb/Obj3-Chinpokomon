package model.ataque;

import model.chimpos.Chinpokomon;

public abstract class Ataque {
    private Integer valor;
    private String nombre;
    private Integer valorExtra;

    public Ataque(Integer valor, String nombre, Integer valorExtra) {
        this.valor = valor;
        this.nombre = nombre;
        this.valorExtra = valorExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValorExtra() {
        return valorExtra;
    }

    public void setValorExtra(Integer valorExtra) {
        this.valorExtra = valorExtra;
    }

    public void atacar(Chinpokomon chipo) {
        if(chipo.getOponente().tieneVentajaSobre(chipo)) {
            this.atacar(chipo, this.getValor() + this.getValorExtra());
        } else {
            this.atacar(chipo, this.getValor());
        }
    }

    public abstract void atacar(Chinpokomon chipo, Integer valor);

}
