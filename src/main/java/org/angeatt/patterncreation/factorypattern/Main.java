package org.angeatt.patterncreation.factorypattern;

import org.angeatt.patterncreation.factorypattern.Exemple.Entrepot1;
import org.angeatt.patterncreation.factorypattern.Exemple.Entrepot2;
import org.angeatt.patterncreation.factorypattern.contreexemple.Departement1;
import org.angeatt.patterncreation.factorypattern.contreexemple.Departement2;

public class Main {

  public static  void main(String[] args){

    String colis1 = "colis1";
    String colis2 = "colis2";

    //design sans factory

    Departement1 departement1 = new Departement1();
    Departement2 departement2 = new Departement2();

    System.out.println( departement1.livraison(colis1) );
    System.out.println( departement2.livraison(colis2) );

    //avec factory

    Transport transport = TransportFactory.createTransport(TypeTransport.CAMION);

    Entrepot1 entrepot1 = new Entrepot1(transport);
    System.out.println( entrepot1.livraison(colis1) );

    Entrepot2 entrepot2 = new Entrepot2(transport);
    System.out.println( entrepot2.livraison(colis2) );

  }

}
