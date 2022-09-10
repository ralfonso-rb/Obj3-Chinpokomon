import model.ataque.PomadaWassington;
import model.batalla.Batalla;
import model.chimpos.Zapato;

public class MainBatallaZapatos {

    public static void main(String[] args){
        Zapato zapato1 = new Zapato("Zapato 1", 5);
        Zapato zapato2 = new Zapato("Zapato 2", 7);
        zapato2.agregarAtaque(new PomadaWassington("Pomada Wassington"));
        Batalla batalla = new Batalla(zapato1, zapato2);
        Referi referi = new Referi(batalla);

    }

}
