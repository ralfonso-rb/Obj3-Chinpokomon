package model.ataque;

import model.chimpos.Chinpokomon;

import java.util.Random;

public class GarraMecanica extends Ataque{

    public GarraMecanica() {
        super(2, "Garra Mecanica", 2);
    }

    public void atacar(Chinpokomon chipo, Integer valor) {
        Random random = new Random();
        int value = random.nextInt(10 + 1) + 1;
        if (value == 1) {
            chipo.recibirDanio(chipo.getVida() / 2);
        } else {
            chipo.recibirDanio(valor);
        }
    }
}
