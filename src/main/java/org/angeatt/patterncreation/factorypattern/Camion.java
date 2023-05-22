package org.angeatt.patterncreation.factorypattern;

public class Camion implements Transport{

  @Override
  public String livrer(String objet) {
    return "Le colis "+ objet+ " sera livré par Camion";
  }
}
