package org.angeatt.patterncomportement.commandpattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireCommand {
  List<Command<Plat>> commands = new ArrayList<>();

  void addCommand(Command command){
    commands.add(command);
  }

  void executeCommands(){
    for (Command<Plat> command : commands){
      command.execute();
    }
  }

}
