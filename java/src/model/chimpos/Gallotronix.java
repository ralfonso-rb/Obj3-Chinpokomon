package model.chimpos;

import model.ataque.Ataque;
import model.ataque.GarraMecanica;

import java.util.ArrayList;
import java.util.Arrays;

public class Gallotronix extends Chinpokomon {

    public Gallotronix(String nombre, Integer nivel) {
        super(nombre, nivel, 25, new ArrayList<Ataque>(Arrays.asList(new GarraMecanica())));
    }

}
