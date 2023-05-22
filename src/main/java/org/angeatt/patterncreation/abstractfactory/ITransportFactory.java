package org.angeatt.patterncreation.abstractfactory;

public interface ITransportFactory {

  TransportAerien getAvion();

  TransportMaritime getBateau();

  TransportTerrestre getCamion();

}
