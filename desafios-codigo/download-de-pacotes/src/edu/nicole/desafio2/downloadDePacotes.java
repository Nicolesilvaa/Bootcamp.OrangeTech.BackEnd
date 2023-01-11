package edu.nicole.desafio2; 

/** @author Nicole Silva
  *  @since 11/01/2023
 */

import java.util.Scanner; 
    
public class downloadDePacotes {
  
    public static void main(String[] args) {
      
      Scanner leitor = new Scanner(System.in);
    
      int tamanho = leitor.nextInt();
        
      for(int i = 0; i < tamanho; i++)
        System.out.print("/");
             
    }
}