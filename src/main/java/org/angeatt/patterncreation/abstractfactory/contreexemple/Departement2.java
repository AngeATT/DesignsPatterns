package org.angeatt.patterncreation.abstractfactory.contreexemple;

import org.angeatt.patterncreation.abstractfactory.Camion1;

public class Departement2 {
  private final Camion1 camion;

  public Departement2() {
    this.camion = new Camion1();
  }
  public String livraison(String colis){
    return camion.livrer(colis);
  }
}
