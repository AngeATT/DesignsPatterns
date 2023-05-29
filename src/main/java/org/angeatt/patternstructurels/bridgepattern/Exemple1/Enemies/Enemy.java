package org.angeatt.patternstructurels.bridgepattern.Exemple1.Enemies;

import org.angeatt.patternstructurels.bridgepattern.Exemple1.Weapons.Weapon;

public interface Enemy {
  void setWeapon(Weapon weapon);
  void attack();
}
