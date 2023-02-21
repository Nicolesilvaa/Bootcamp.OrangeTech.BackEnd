package edu.nicole.desafio1;
import java.util.Scanner;

 /** @author Nicole Silva
  *  @since 20/02/2023
 */


public class dcMonalds{

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");
        
        for(String nomes: listaIngredientes)
          System.out.println(nomes);
    
    } 
}
