package org.angeatt.patterncreation.factorypattern.Exemple;

import org.angeatt.patterncreation.factorypattern.Transport;

public class Entrepot1 {
  Transport transport;

  public Entrepot1(Transport transport){
    this.transport = transport;
  }
  public String livraison(String colis){
    return transport.livrer(colis);
  }
}
