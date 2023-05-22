package org.angeatt.patterncreation.factorypattern.Exemple;

import org.angeatt.patterncreation.factorypattern.Transport;

public class Entrepot2 {
  Transport transport;

  public Entrepot2(Transport transport){
    this.transport = transport;
  }
  public String livraison(String colis){
    return transport.livrer(colis);
  }
}
