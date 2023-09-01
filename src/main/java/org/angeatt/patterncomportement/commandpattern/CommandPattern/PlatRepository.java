package org.angeatt.patterncomportement.commandpattern.CommandPattern;

public class PlatRepository  {
  void findAll(){};
  void add(Plat plat){
    System.out.println("Plat ajouté");
  };

  void delete(Plat plat){
    System.out.println("Plat supprimé");
  }

  void modifier(Plat plat){
    System.out.println("Plat modifié");
  }
}
