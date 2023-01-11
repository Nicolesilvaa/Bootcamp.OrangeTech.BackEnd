package edu.nicole.desafio4;

/**
 * @author Nicole Silva
 * @since 11/01/2023
 * 
 */

import java.util.Scanner; 
    
public class lojinhaDeDoces {
  
    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        int quantidadeDoces;

        System.out.println(" Qual a quantidade dinheiro do cliente?  ");
        int quantidadeDinheiro = leitor.nextInt();
        
        quantidadeDoces = quantidadeDinheiro * 2;
        System.out.println("O cliente obteve " + quantidadeDoces + " doces ");
      
    }
  }
