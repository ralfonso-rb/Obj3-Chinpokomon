package model;
import enums.TipoChinpokomon;
import model.batalla.Batalla;
import model.chimpos.Gallotronix;
import model.chimpos.*;
import model.referi.Referi;

public class MainBatallaZapatoGallotronix {

    public static void main(String[] args) {
        Zapato zapato = new Zapato("Zapato", 5 , TipoChinpokomon.ROBOT);
        Gallotronix gallotronix = new Gallotronix("Gallotronix", 5, TipoChinpokomon.ANIMAL);
        Batalla batalla = new Batalla(zapato, gallotronix);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }

}