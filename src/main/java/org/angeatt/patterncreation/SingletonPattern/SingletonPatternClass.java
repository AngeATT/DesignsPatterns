package org.angeatt.patterncreation.SingletonPattern;

import java.util.Arrays;

public enum SingletonPatternClass {
  UNIQUE_INSTANCE;

  private String bonjour;

  public int calculSomme(int ...notes){
    return Arrays.stream(notes).reduce( 0, Integer::sum);
  }

  private SingletonPatternClass(){}

}
