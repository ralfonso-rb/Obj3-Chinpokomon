package model;
import model.batalla.Batalla;
import model.chimpos.Carnotron;
import model.chimpos.Gallotronix;
import model.referi.Referi;

public class MainBatallaCarnotronGallotronix {

    public static void main(String[] args) {
        Gallotronix gallotronix = new Gallotronix("Gallotronix", 5);
        Carnotron carnotron = new Carnotron("Carnotron", 6);
        Batalla batalla = new Batalla(carnotron, gallotronix);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }

}
