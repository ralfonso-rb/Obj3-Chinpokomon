package model.chimpos;

import model.ataque.Ataque;
import model.ataque.GarraMecanica;
import model.tipo.TipoChinpokomon;

import java.util.ArrayList;
import java.util.Arrays;

public class Gallotronix extends Chinpokomon {

    public Gallotronix(String nombre, Integer nivel, TipoChinpokomon tipo) {
        super(nombre, nivel, 25, new ArrayList<Ataque>(Arrays.asList(new GarraMecanica())), tipo);
    }

}
