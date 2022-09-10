package model.chimpos;

import enums.TipoChinpokomon;
import model.ataque.Ataque;
import model.ataque.Zapatazo;

import java.util.ArrayList;
import java.util.Arrays;

public class Zapato extends Chinpokomon {

    public Zapato(String nombre, Integer nivel, TipoChinpokomon tipo) {
        super(nombre, nivel, 30, new ArrayList<Ataque>(Arrays.asList(new Zapatazo())), tipo);
    }

}
