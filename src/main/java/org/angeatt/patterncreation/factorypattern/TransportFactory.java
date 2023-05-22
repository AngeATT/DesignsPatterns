package org.angeatt.patterncreation.factorypattern;

public class TransportFactory {

 public static Transport createTransport(TypeTransport transport){
   if(transport == TypeTransport.AVION){
     return new Avion();
   } else if (transport == TypeTransport.BATEAU) {
     return new Bateau();
   } else if (transport == TypeTransport.CAMION) {
     return new Camion();
   }else {
     throw new IllegalArgumentException("Type de transport inconnu");
   }
 }

}
