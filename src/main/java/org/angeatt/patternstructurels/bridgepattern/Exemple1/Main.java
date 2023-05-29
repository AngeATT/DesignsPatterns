package org.angeatt.patternstructurels.bridgepattern.Exemple1;

import org.angeatt.patternstructurels.bridgepattern.Exemple1.Enemies.BasicEnemy;
import org.angeatt.patternstructurels.bridgepattern.Exemple1.Enemies.BossEnemy;
import org.angeatt.patternstructurels.bridgepattern.Exemple1.Weapons.EpeeCeleste;
import org.angeatt.patternstructurels.bridgepattern.Exemple1.Weapons.Gourdin;

public class Main {

  public static void main(String[] args) {
    BasicEnemy slime = new BasicEnemy("Slime",new Gourdin());
    slime.attack();

    BossEnemy bossEnemy = new BossEnemy("Boss pallier 5",new Gourdin());
    bossEnemy.attack();
    System.out.println("Les pv du Boss sont devenus low, le bosse enemie change d'arme : ");
    bossEnemy.setWeapon(new EpeeCeleste());
    bossEnemy.attack();
  }

}
