import model.batalla.Batalla;
import model.chimpos.Gallotronix;
import model.chimpos.Zapato;

public class MainBatallaZapatoGallotronix {

    public static void main(String[] args) {
        Zapato zapato = new Zapato("Zapato", 5);
        Gallotronix gallotronix = new Gallotronix("Gallotronix", 5);
        Batalla batalla = new Batalla(zapato, gallotronix);
        batalla.comenzarBatalla();
    }

}