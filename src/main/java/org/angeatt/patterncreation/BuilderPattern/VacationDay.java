package org.angeatt.patterncreation.BuilderPattern;

public class VacationDay {
   private final String date;

  private final String heureReservation;
  private final String activite;

  public VacationDay(String date,String activite, String heureReservation){
    this.date = date;
    this.activite = activite;
    this.heureReservation = heureReservation;
  }

  public String getDate() {
    return date;
  }

  public String getHeureReservation() {
    return heureReservation;
  }

  public String getActivite() {
    return activite;
  }

  String afficherPlanningDuJour(){
      return "Jour : " + this.getDate() + " ,activité : " + this.activite + " ,réservation : " + this.heureReservation
          + "\t";
  }
}
