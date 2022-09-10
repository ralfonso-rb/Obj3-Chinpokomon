package model;
import enums.TipoChinpokomon;
import model.batalla.Batalla;
import model.chimpos.*;
import model.referi.Referi;


public class MainBatallaCarnotronZapato {

    public static void main(String[] args) {
        Carnotron carnotron = new Carnotron("Carnotron", 6, TipoChinpokomon.ROBOT);
        Zapato zapato = new Zapato("Zapato", 5, TipoChinpokomon.ANIMAL);
        Batalla batalla = new Batalla(carnotron, zapato);
        Referi referi = new Referi(batalla);
        referi.gestionarBatalla();
    }
}