package edu.nicole.desafio1;
import java.util.Scanner;


 /** @author Nicole Silva
  *  @since 20/02/2023
 */


public class salvandoMusica {
    
    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        if(arquivoDoPc.contains(".mp3"))
          System.out.println("Salvar");
          
        else
          System.out.println("Deletar");
    }  
}
    