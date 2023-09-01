package org.angeatt.patterncomportement.commandpattern.CommandPattern;

public class CommandModifierPlat implements Command<Plat> {
  Plat plat;
  PlatRepository platRepository = new PlatRepository();
  CommandModifierPlat(Plat plat){
    this.plat = plat;
  }
  @Override
  public void execute() {
    platRepository.delete(this.plat);
  }
}
