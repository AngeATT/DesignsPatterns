package org.angeatt.patterncreation.factorypattern.contreexemple;

import org.angeatt.patterncreation.factorypattern.Camion;

public class Departement1 {

  private final Camion camion;

  public Departement1(){
    camion = new Camion();
  }

  public String livraison(String colis){
    return camion.livrer(colis);
  }

}
