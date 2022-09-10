import enums.TipoChinpokomon;
import model.batalla.Batalla;
import model.chimpos.Carnotron;
import model.chimpos.Gallotronix;

public class MainBatallaCarnotronGallotronix {

    public static void main(String[] args) {
        Gallotronix gallotronix = new Gallotronix("Gallotronix", 5, TipoChinpokomon.ROBOT);
        Carnotron carnotron = new Carnotron("Carnotron", 6, TipoChinpokomon.ANIMAL);
        Batalla batalla = new Batalla(carnotron, gallotronix);
        batalla.comenzarBatalla();
    }

}
