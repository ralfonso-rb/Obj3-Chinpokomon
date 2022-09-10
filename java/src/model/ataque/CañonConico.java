package model.ataque;

import model.chimpos.Chinpokomon;

public class CañonConico extends Ataque {

    public CañonConico() {
        super(4, "Cañón Cónico", 1);
    }

    @Override
    public void atacar(Chinpokomon chipo, Integer valor) {
        chipo.recibirDanio(valor);
    }

}
