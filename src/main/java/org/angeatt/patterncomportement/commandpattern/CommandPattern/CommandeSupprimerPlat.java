package org.angeatt.patterncomportement.commandpattern.CommandPattern;

public class CommandeSupprimerPlat implements Command<Plat> {
  Plat plat;
  PlatRepository platRepository = new PlatRepository();
  CommandeSupprimerPlat(Plat plat){
    this.plat = plat;
  }
  @Override
  public void execute() {
    platRepository.delete(plat);
  }
}