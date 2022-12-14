package model.batalla;

import model.chimpos.Chinpokomon;
import model.logger.Logger;

import java.util.Random;

public class  Batalla {

    private Chinpokomon chipo1;
    private Chinpokomon chipo2;

    public Batalla(Chinpokomon chipo1 , Chinpokomon chipo2 ) {
        this.setTurnos(chipo1, chipo2);
        chipo1.setOponente(chipo2);
        chipo2.setOponente(chipo1);
    }

    private void setTurnos(Chinpokomon chipo1, Chinpokomon chipo2) {
        Random random = new Random();
        int value = random.nextInt(2 + 1) + 1;
        if(value == 1) {
            this.chipo1 = chipo1;
            this.chipo2 = chipo2;
        }
        else {
            this.chipo2 = chipo1;
            this.chipo1 = chipo2;
        }
    }

    public void comenzarBatalla() {
        while(sigueAlgunoConVida(chipo1,chipo2)) {
            chipo1.atacar(chipo2);
            chipo2.atacar(chipo1);
            this.verificarMuertos();
        }
        this.printGanador();
    }

    private void verificarMuertos() {
        if(chipo1.estaMuerto()) {
            Logger.getInstance().info(chipo1.getNombre() + " se murio");
        }
        else if (chipo2.estaMuerto()) {
            Logger.getInstance().info(chipo2.getNombre() + " se murio");
        }
        else {
            Logger.getInstance().info("La batalla entre " + chipo1.getNombre() + " y " + chipo2.getNombre() + " continua");
        }
    }

    private Chinpokomon printGanador() {
        if(!this.chipo1.estaMuerto()) {
            Logger.getInstance().info(chipo1.getNombre() + " ES EL GANADOR");
            return chipo1;
        }
        else {
            Logger.getInstance().info(chipo2.getNombre() + " ES EL GANADOR!");
            return chipo2;
        }
    }

    private boolean sigueAlgunoConVida(Chinpokomon chipo1, Chinpokomon chipo2) {
        return !(chipo1.estaMuerto() || chipo2.estaMuerto());
    }
}
