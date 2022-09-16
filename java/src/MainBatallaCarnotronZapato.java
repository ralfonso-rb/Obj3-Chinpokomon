
import model.batalla.Batalla;
import model.chimpos.*;
import model.logger.Logger;
import model.logger.Nivel;
import model.referi.Referi;
import model.tipo.TipoChinpokomon;


public class MainBatallaCarnotronZapato {

    public static void main(String[] args) {
        Logger.getInstance(Nivel.INFO);
        Carnotron carnotron = new Carnotron("Carnotron", 6, TipoChinpokomon.ROBOT);
        Zapato zapato = new Zapato("Zapato", 5, TipoChinpokomon.ANIMAL);
        Batalla batalla = new Batalla(carnotron, zapato);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }
}