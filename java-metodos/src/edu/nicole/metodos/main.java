package edu.nicole.metodos;

/** @author Nicole Silva
  *  @since 10/01/2023
*/

import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;

        System.out.println("Digite 2 números ");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

        calculadora.soma(valor1,valor2);
        calculadora.subtracao(valor1,valor2);
        calculadora.multiplicacao(valor1,valor2);
        calculadora.divisao(valor1,valor2);

        System.out.println("FIM!");

    }
}