package model.ataque;

import model.chimpos.Chinpokomon;

import java.util.Random;

public class Zapatazo extends Ataque {

    public Zapatazo() {
        super(1, "Zapatazo");
    }

    @Override
    public void atacar(Chinpokomon chipo) {
        Random random = new Random();
        int value = random.nextInt(2 + 1) + 1;
        if (value == 1) {
            chipo.recibirDanio(this.getDanio() * 2);
        } else {
            chipo.recibirDanio(this.getDanio());
        }
    }

}
