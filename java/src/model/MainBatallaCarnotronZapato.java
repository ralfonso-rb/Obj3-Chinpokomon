import model.batalla.Batalla;
import model.chimpos.Carnotron;
import model.chimpos.Gallotronix;

public class MainBatallaCarnotronZapato {

    public static void main(String[] args) {
        Carnotron carnotron = new Carnotron("Carnotron", 6);
        Zapato zapato = new Zapato("Zapato", 5);
        Batalla batalla = new Batalla(carnotron, zapato);
        Referi referi = new Referi(batalla);
    }
}