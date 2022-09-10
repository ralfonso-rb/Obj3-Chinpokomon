import enums.TipoChinpokomon;
import model.ataque.PomadaWassington;
import model.batalla.Batalla;
import model.chimpos.Zapato;

public class MainBatallaZapatos {

    public static void main(String[] args){
        Zapato zapato1 = new Zapato("Zapato 1", 5, TipoChinpokomon.ROBOT);
        Zapato zapato2 = new Zapato("Zapato 2", 7, TipoChinpokomon.ANIMAL);
        zapato2.agregarAtaque(new PomadaWassington("Pomada Wassington"));
        Batalla batalla = new Batalla(zapato1, zapato2);
        batalla.comenzarBatalla();
    }

}
