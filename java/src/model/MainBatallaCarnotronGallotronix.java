package model;
import enums.TipoChinpokomon;
import model.batalla.Batalla;
import model.chimpos.Carnotron;
import model.chimpos.Gallotronix;
import model.referi.Referi;

public class MainBatallaCarnotronGallotronix {

    public static void main(String[] args) {
        Gallotronix gallotronix = new Gallotronix("Gallotronix", 5, TipoChinpokomon.ROBOT);
        Carnotron carnotron = new Carnotron("Carnotron", 6, TipoChinpokomon.ANIMAL);
        Batalla batalla = new Batalla(carnotron, gallotronix);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }

}
