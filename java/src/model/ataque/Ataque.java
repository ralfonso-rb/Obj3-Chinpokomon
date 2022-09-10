package model.ataque;

import model.chimpos.Chinpokomon;

public abstract class Ataque {
    private Integer danio;
    private String nombre;

    public Ataque(Integer danio, String nombre) {
        this.danio = danio;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDanio() {
        return danio;
    }

    public void setDanio(Integer danio) {
        this.danio = danio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void atacar(Chinpokomon chipo);
}