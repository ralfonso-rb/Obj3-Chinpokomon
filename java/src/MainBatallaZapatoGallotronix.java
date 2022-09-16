
import model.batalla.Batalla;
import model.chimpos.Gallotronix;
import model.chimpos.*;
import model.logger.Logger;
import model.logger.Nivel;
import model.referi.Referi;
import model.tipo.TipoChinpokomon;

public class MainBatallaZapatoGallotronix {

    public static void main(String[] args) {
        Logger.getInstance(Nivel.INFO);
        Zapato zapato = new Zapato("Zapato", 5 , TipoChinpokomon.ROBOT);
        Gallotronix gallotronix = new Gallotronix("Gallotronix", 5, TipoChinpokomon.ANIMAL);
        Batalla batalla = new Batalla(zapato, gallotronix);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }

}