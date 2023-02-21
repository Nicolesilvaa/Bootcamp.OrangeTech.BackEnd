package edu.nicole.desafio10;
import java.util.Scanner;

 /** @author Nicole Silva
  *  @since 20/02/2023
 */


public class camaroteDoBlue{

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
      for(int i = 0; i <= tamanhoDaFila; i++)
        if(i % 2 != 0)
          pessoasNoCamarote++;
          
      System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
    
}