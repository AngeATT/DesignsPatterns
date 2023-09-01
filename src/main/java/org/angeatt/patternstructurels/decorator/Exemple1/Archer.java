package org.angeatt.patternstructurels.decorator.Exemple1;

public class Archer implements Personnage{
  Personnage personnage;

  Archer(Personnage personnage){
    this.personnage = personnage;
  }
  @Override
  public void attack() {
    System.out.println("Personnage attaque avec arc");
  }
}
