package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone Nombre de un empleado
   * @return Cadena tipo String
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
