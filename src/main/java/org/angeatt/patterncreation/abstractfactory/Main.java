package org.angeatt.patterncreation.abstractfactory;

import org.angeatt.patterncreation.abstractfactory.Exemple.Entrepot1;

public class Main {

  public static void main(String[] args) {

    String colis1 = "colis 1";
    String colis2 = "colis 2";

    System.out.println("Livraison avec la factory d'abidjan");

    ITransportFactory transportFactoryAbidjan = new TransportFactoryAbidjan();
    Transport transportCamionABidjan = transportFactoryAbidjan.getCamion();
    Transport transportBateauABidjan = transportFactoryAbidjan.getBateau();

    Entrepot1 entrepot1 = new Entrepot1(transportCamionABidjan);
    System.out.println(entrepot1.livraison(colis1));

    Entrepot1 exempleDepartement2 = new Entrepot1(transportBateauABidjan);
    System.out.println(exempleDepartement2.livraison(colis2));

    System.out.println("\nLivraison avec la factory d'aboisso");

    ITransportFactory transportFactorySanPedro = new TransportFactorySanPedro();
    Transport transportBateauSanPedro = transportFactorySanPedro.getBateau();
    Transport transportCamionSanPedro = transportFactorySanPedro.getCamion();

    entrepot1 = new Entrepot1(transportBateauSanPedro);
    System.out.println(entrepot1.livraison(colis1));

    exempleDepartement2 = new Entrepot1(transportCamionSanPedro);
    System.out.println(exempleDepartement2.livraison(colis2));


  }

}
