package org.angeatt.patterncomportement.commandpattern.CommandPattern;

public class CommandAjouterPlat implements Command<Plat> {
  PlatRepository platRepository = new PlatRepository();
  Plat plat;
  CommandAjouterPlat(Plat plat){
    this.plat = plat;
  }
  @Override
  public void execute() {
    platRepository.delete(this.plat);
  }

}
