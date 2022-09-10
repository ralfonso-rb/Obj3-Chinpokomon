package model.chimpos;

import enums.TipoChinpokomon;
import model.ataque.Ataque;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Chinpokomon {
    String nombre;
    Integer nivel;
    Integer vida;
    List<Ataque> ataques = new ArrayList<Ataque>();
    TipoChinpokomon tipo;
    Chinpokomon oponente = null;

    public Chinpokomon(String nombre, Integer nivel, Integer vida, List<Ataque> ataques, TipoChinpokomon tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.ataques = ataques;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public TipoChinpokomon getTipo() {return tipo;}

    public void setTipo(TipoChinpokomon tipo) { this.tipo = tipo; }


    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public Chinpokomon getOponente() {
        return oponente;
    }

    public void setOponente(Chinpokomon oponente) {
        this.oponente = oponente;
    }

    public void atacar(Chinpokomon chipo) {
        Random random = new Random();
        Ataque arma = ataques.get(random.nextInt(ataques.size()));
        if(!this.estaMuerto()) {
            System.out.println(this.getNombre() + " ataca con " + arma.getNombre());
            arma.atacar(chipo);
        }
    }

    public void agregarAtaque(Ataque ataque) {
       this.getAtaques().add(ataque);
    }

    public boolean estaMuerto() {
        return this.getVida() <= 0;
    }

    public void recibirDanio(Integer danio) {
        if(this.getVida() - danio > 0) {
            this.setVida(this.getVida() - danio);
        }
        else {
            this.setVida(0);
        }
        System.out.println(this.getNombre() + " recibio danio " + danio + ", le queda " + this.getVida() + " de vida");
    }

    public void agregarVida(Integer vida) {
        this.setVida(this.getVida() + vida);
        System.out.println(this.getNombre() + " recibio vida " + vida + ", le queda " + this.getVida() + " de vida");
    }

    public boolean tieneVentajaSobre(Chinpokomon chipo) {
        return this.getTipo() == TipoChinpokomon.ROBOT && chipo.getTipo() == TipoChinpokomon.ANIMAL ||
                this.getTipo() == TipoChinpokomon.ANIMAL && chipo.getTipo() == TipoChinpokomon.COSA ||
                this.getTipo() == TipoChinpokomon.COSA && chipo.getTipo() == TipoChinpokomon.ROBOT;
    }

}