package org.angeatt.patterncreation.factorypattern.contreexemple;

import org.angeatt.patterncreation.factorypattern.Camion;

public class Departement2 {
  private final Camion camion;

  public Departement2() {
    this.camion = new Camion();
  }
  public String livraison(String colis){
    return camion.livrer(colis);
  }
}
