package org.angeatt.patterncreation.abstractfactory;

public class TransportFactoryAbidjan implements ITransportFactory {

  @Override
  public  TransportAerien getAvion() {
    return new Avion();
  }

  @Override
  public TransportMaritime getBateau() {
    return new Bateau1();
  }

  @Override
  public TransportTerrestre getCamion() {
    return new Camion1();
  }
}
