package org.angeatt.patterncreation.factorypattern;

public class Bateau implements Transport{

  @Override
  public String livrer(String objet) {
    return "Le colis "+ objet+ " sera livré par Bateau";
  }
}
