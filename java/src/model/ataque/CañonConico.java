package model.ataque;

import model.chimpos.Chinpokomon;

public class CañonConico extends Ataque {

    public CañonConico() {
        super(4, "Cañón Cónico");
    }

    @Override
    public void atacar(Chinpokomon chipo) {
        chipo.recibirDanio(this.getDanio());
    }
}
