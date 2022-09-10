package model.ataque;

import model.chimpos.Chinpokomon;

public class RayoVeloz extends Ataque {

    public RayoVeloz() {
        super(3, "Rayo Veloz", 1);
    }

    @Override
    public void atacar(Chinpokomon chipo, Integer valor) {
        chipo.recibirDanio(valor);
    }

}
