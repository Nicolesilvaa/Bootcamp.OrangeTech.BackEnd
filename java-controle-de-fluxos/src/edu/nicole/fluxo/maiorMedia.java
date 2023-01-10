package edu.nicole.fluxo;

/** @author Nicole Silva
  *  @since 09/01/2023

 */

import java.util.Scanner; 

public class maiorMedia{

    /*Este método recebe 5 números e retorna o maior númer e a média  entre eles*/
        
     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int maior = 0;
        int soma = 0;
        double media = 0;
        

        System.out.println("Digite os 5 valores: ");
        for(int i = 0; i < 5; i++){
            numero = scanner.nextInt();

            if(numero > maior) 
                maior = numero;

            soma += numero;
            media = soma/5;
            
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("A média entre os valores é: " + media);
       

    }
}