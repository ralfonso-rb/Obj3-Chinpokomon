package model.referi;

import model.batalla.Batalla;

public class Referi {

   private Batalla batalla;

   public Referi(Batalla batalla) {
      this.batalla = batalla;
   }

   public void gestionarBatalla(){

      getBatalla().comenzarBatalla();
   }

   public Batalla getBatalla() {
      return batalla;
   }

   public void setBatalla(Batalla batalla) {
      this.batalla = batalla;
   }
}