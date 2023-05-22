package org.angeatt.patterncreation.abstractfactory;

public class Bateau1 implements TransportMaritime {

  @Override
  public String livrer(String objet) {
    return "Le colis "+ objet+ " sera livré par le Bateau 1";
  }
}
