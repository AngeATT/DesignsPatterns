package org.angeatt.patterncreation.abstractfactory;

public class Bateau2 implements TransportMaritime{
  @Override
  public String livrer(String objet) {
    return "Le colis "+ objet+ " sera livré par le Bateau 2";
  }
}
