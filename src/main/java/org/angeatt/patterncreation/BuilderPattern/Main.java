package org.angeatt.patterncreation.BuilderPattern;

import java.util.List;
import org.angeatt.patterncreation.BuilderPattern.Vacation.VacationBuilder;

public class Main {

  public static void main(String[] args) {
      Vacation vacation = new Vacation.VacationBuilder("Ange","Hotel ivoire").addDay("15-06-2023","Restaurant","20h")
          .and()
          .addDay("15-06-2023","balade","10h")
          .build();
      vacation.getVaccationPlanner();
      Vacation vacation1 = new Vacation.VacationBuilder("sebastien","nomm").build();
      vacation1.getVaccationPlanner();
  }


}
