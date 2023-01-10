package edu.nicole.metodos;

/** @author Nicole Silva
  *  @since 10/01/2023
*/

public class  calculadora {

  public static void soma(double numero1, double numero2){

    double resultado = numero1 + numero2;

    System.out.println(numero1 + " + " + numero2 + " = " + resultado);

  }

  public static void subtracao(double numero1, double numero2){

    double resultado = numero1 - numero2;

    System.out.println(numero1 + " - " + numero2 + " = " + resultado);

  }

  public static void multiplicacao(double numero1, double numero2){

    double resultado = numero1 * numero2;

    System.out.println(numero1 + " * " + numero2 + " = " + resultado);

  }

  public static void divisao(double numero1, double numero2){

    double resultado = numero1 / numero2;

    System.out.println(numero1 + " / " + numero2 + " = " + resultado);

  }

}