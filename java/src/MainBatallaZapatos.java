
import model.ataque.PomadaWassington;
import model.batalla.Batalla;
import model.chimpos.*;
import model.logger.Logger;
import model.logger.Nivel;
import model.referi.Referi;
import model.tipo.TipoChinpokomon;

public class MainBatallaZapatos {
    public static void main(String[] args) {
        Logger.getInstance(Nivel.INFO);
        Zapato zapato1 = new Zapato("Zapato 1", 5, TipoChinpokomon.ROBOT);
        Zapato zapato2 = new Zapato("Zapato 2", 7, TipoChinpokomon.ANIMAL);
        zapato2.agregarAtaque(new PomadaWassington("Pomada Wassington"));
        Batalla batalla = new Batalla(zapato1, zapato2);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }
}
