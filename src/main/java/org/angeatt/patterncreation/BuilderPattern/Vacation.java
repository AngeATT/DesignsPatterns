package org.angeatt.patterncreation.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Vacation {

  String personne;

  private  String hotel;
  List<VacationDay> vacationDays = new ArrayList<>();

  private Vacation(){}
  private Vacation (VacationBuilder vacationBuilder){
    this.personne = vacationBuilder.personne;
    this.hotel = vacationBuilder.hotel;
    vacationDays = vacationBuilder.vacationDays;
  }

  void getVaccationPlanner() {
    System.out.println("\nPlannification jour de vaccances de : "+ this.personne + " qui réside à l'hotel : " + this.hotel + "\n");
    if (vacationDays == null || vacationDays.size() == 0) {
      System.out.println("Aucun jour ajouté");
      return;
    }
    for (VacationDay vacationDay : vacationDays){
      System.out.println( vacationDay.afficherPlanningDuJour() );
    }
  }

  public static class VacationBuilder{

    String personne;
    String hotel;

    List<VacationDay> vacationDays = new ArrayList<>();

    VacationDay currentDay = null;

    VacationBuilder(String personne, String hotel){
      this.personne = personne;
      this.hotel = hotel;
    }
    VacationBuilder addDay(String date,String activite,String reservation){
      currentDay = new VacationDay(date,activite,reservation);
      return this;
    }
    VacationBuilder and(){
      vacationDays.add(currentDay);
      currentDay = null;
      return this;
    }
    Vacation build(){
      if (currentDay != null) vacationDays.add(currentDay);
      return new Vacation(this);
    }
  }

}
