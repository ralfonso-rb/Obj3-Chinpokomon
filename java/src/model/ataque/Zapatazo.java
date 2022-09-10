package model.ataque;

import model.chimpos.Chinpokomon;

import java.util.Random;

public class Zapatazo extends Ataque {

    public Zapatazo() {
        super(1, "Zapatazo", 3);
    }

    public void atacar(Chinpokomon chipo, Integer valor) {
        Random random = new Random();
        int value = random.nextInt(2 + 1) + 1;
        if (value == 1) {
            chipo.recibirDanio(valor * 2);
        } else {
            chipo.recibirDanio(valor);
        }
    }

}
