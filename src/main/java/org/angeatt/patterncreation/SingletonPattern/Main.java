package org.angeatt.patterncreation.SingletonPattern;

public class Main {

  public static void main(String[] args) {
    /* SingletonPatternClass singletonPatternClass = SingletonPatternClass.getInstance();
    SingletonPatternClass singletonPatternClass1 = SingletonPatternClass.getInstance();
    System.out.println(singletonPatternClass1 == singletonPatternClass);   */

    SingletonPatternClass singletonPatternClass = SingletonPatternClass.UNIQUE_INSTANCE;
    SingletonPatternClass singletonPatternClass1 = SingletonPatternClass.UNIQUE_INSTANCE;

    System.out.println(singletonPatternClass == singletonPatternClass1); //always true
    System.out.println( singletonPatternClass.calculSomme(10,20,20));

  }
}
