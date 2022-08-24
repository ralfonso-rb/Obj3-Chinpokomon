import java.util.Random;

public class AtaqueGarraMecanica extends Ataque{

    public AtaqueGarraMecanica(Integer danio, String nombre) {
        super(danio, nombre);
    }

    @Override
    public void atacar(Chinpokomon chipo) {
        Random random = new Random();
        int value = random.nextInt(10 + 1) + 1;
        if (value == 1) {
            chipo.setVida(chipo.getVida() / 2);
        } else {
            chipo.setVida(chipo.getVida()-getDanio());
        }
    }
}
