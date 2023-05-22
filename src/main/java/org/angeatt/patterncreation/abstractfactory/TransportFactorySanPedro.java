package org.angeatt.patterncreation.abstractfactory;

public class TransportFactorySanPedro implements ITransportFactory {

  @Override
  public TransportAerien getAvion() {
    return new Avion();
  }

  @Override
  public TransportMaritime getBateau() {
    return new Bateau2();
  }

  @Override
  public TransportTerrestre getCamion() {
    return new Camion2();
  }
}
