package model.ataque;

import model.chimpos.Chinpokomon;

public class RayoVeloz extends Ataque {

    public RayoVeloz() {
        super(3, "Rayo Veloz");
    }

    @Override
    public void atacar(Chinpokomon chipo) {
        chipo.recibirDanio(this.getDanio());
    }
}
