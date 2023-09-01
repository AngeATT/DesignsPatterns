package org.angeatt.patterncreation.BuilderPattern;

public class EleveBuilder {
  String nom;
  String prenom;

  public EleveBuilder setNom(String nom){
      this.nom = nom;
      return this;
  }
  public  EleveBuilder setPrenom(String prenom){
    this.prenom = prenom;
    return this;
  }
  public Eleve build(){
    return new Eleve(this);
  }

}
