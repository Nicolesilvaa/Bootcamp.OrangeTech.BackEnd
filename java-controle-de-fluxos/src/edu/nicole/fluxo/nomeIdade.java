 /** @author Nicole Silva
  *  @since 09/01/2023

 */

package edu.nicole.fluxo;
import java.util.Scanner; 

public class nomeIdade{

    /*Este método recebe um nome e uma idade até que o nome digitado seja igual a zero. */
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome = " ";
        int idade = 0;
        
        while(true){

            System.out.println("Digite o nome: ");
            nome = scanner.next();

            if(nome.equals("0")) 
                break;
                
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();


        }

    }
}