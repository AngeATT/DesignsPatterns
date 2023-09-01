package org.angeatt.patternstructurels.decorator.Exemple1;

public class Chevalier implements Personnage {
  private final Personnage personnage;

  Chevalier(Personnage personnage){
    this.personnage = personnage;
  }

  @Override
  public void attack() {
    System.out.println("Personnage attaque avec épée");
  }
}
