package org.angeatt.patterncreation.BuilderPattern;

public class Eleve {
  String nom;
  String prenom;
  Eleve(EleveBuilder eleveBuilder){
    this.nom = eleveBuilder.nom;
    this.prenom = eleveBuilder.prenom;
  }
}
