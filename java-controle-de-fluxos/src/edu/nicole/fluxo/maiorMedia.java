package edu.nicole.fluxo;

/** @author Nicole Silva
  *  @since 09/01/2023

 */

import java.util.Scanner;

public class maiorMedia{

    /*Este método recebe 5 números e retorna o maior númer e a média  entre eles*/
        
     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        double maior = 0;
        double soma = 0;
        double media = 0;
        

        System.out.println("Digite os 5 valores: ");
        for(int i = 0; i < 5; i++){
            numero = scanner.nextInt();

            if(numero > maior) 
                maior = numero;

            soma += numero;
            media = soma/5;
            
        }

        System.out.printf("O maior número é: %.1f \n", maior);
        System.out.printf("A média entre os valores é: %.1f  ", media);
       

    }
}