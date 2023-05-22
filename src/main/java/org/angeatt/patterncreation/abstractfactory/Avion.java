package org.angeatt.patterncreation.abstractfactory;

public class Avion implements TransportAerien {

  @Override
  public String livrer(String objet) {
    return "Le colis "+ objet+ " sera livré par avion";
  }
}
