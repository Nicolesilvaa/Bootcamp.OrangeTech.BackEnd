package edu.nicole.desafio1;
import java.util.Scanner;


 /** @author Nicole Silva
  *  @since 20/02/2023
 */


public class imoveisDisponiveis{

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = frase.split("/");
        
        String imovel = array[0];
        int preco = Integer.parseInt(array[1]);
        String status = array[2];
        
        System.out.println(" Imovel: " + imovel + " R$" + preco + " " + status);
    }
}