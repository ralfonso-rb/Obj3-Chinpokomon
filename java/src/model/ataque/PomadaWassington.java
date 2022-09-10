package model.ataque;

import model.chimpos.Chinpokomon;

public class PomadaWassington extends Ataque {

    public PomadaWassington(String nombre) {
        super(5, nombre, 1);
    }

    @Override
    public void atacar(Chinpokomon chipo, Integer valor) {
        chipo.getOponente().agregarVida(valor);
    }

}
