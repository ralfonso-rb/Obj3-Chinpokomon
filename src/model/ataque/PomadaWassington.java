package model.ataque;

import model.chimpos.Chinpokomon;

public class PomadaWassington extends Ataque {

    public PomadaWassington(String nombre) {
        super(0, nombre);
    }

    @Override
    public void atacar(Chinpokomon chipo) {
        chipo.getOponente().agregarVida(5);
    }

}
