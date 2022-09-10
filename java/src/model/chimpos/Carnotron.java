package model.chimpos;

import enums.TipoChinpokomon;
import model.ataque.Ataque;
import model.ataque.CañonConico;
import model.ataque.RayoVeloz;

import java.util.ArrayList;
import java.util.Arrays;

public class Carnotron extends Chinpokomon {

    public Carnotron(String nombre, Integer nivel, TipoChinpokomon tipo) {
        super(nombre, nivel, 20, new ArrayList<Ataque>(Arrays.asList(new RayoVeloz(), new CañonConico())), tipo);
    }

}
