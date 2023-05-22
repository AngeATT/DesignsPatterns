package org.angeatt.patterncreation.abstractfactory;

public class Camion2 implements TransportTerrestre{
  @Override
  public String livrer(String objet) {
    return "Le colis "+ objet+ " sera livré par le Camion 2";
  }
}
