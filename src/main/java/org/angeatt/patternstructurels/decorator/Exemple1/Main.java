package org.angeatt.patternstructurels.decorator.Exemple1;

public class Main {

  public static void main(String[] args) {
    Personnage personnage = null;
    Chevalier chevalier = new Chevalier(personnage);
    chevalier.attack();
  }

}
