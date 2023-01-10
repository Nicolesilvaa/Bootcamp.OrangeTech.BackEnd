package edu.nicole.fluxo;

 /** @author Nicole Silva
  *  @since 09/01/2023
 */

import java.util.Scanner;

public class fatorial{
 
    /*Este método retorna o fatorial de um número */
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int fat = 1;

        System.out.println("Digite o número:");
        numero = scanner.nextInt();

        for(int i = numero; i > 0; i--)
            fat *= i;
        
        System.out.println("O fatorial de " + numero + " é: " + fat);
        
    }
}
