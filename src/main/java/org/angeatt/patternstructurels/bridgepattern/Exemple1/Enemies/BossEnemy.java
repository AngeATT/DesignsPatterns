package org.angeatt.patternstructurels.bridgepattern.Exemple1.Enemies;

import org.angeatt.patternstructurels.bridgepattern.Exemple1.Weapons.Weapon;

public class BossEnemy implements Enemy {
  private final String name;
  private Weapon weapon;

  public BossEnemy(String name, Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  @Override
  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public void attack() {
    System.out.println(this.name);
    this.weapon.use();
  }
}
