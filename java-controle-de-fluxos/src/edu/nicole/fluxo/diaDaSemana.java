 /** @author Nicole Silva
  *  @since 09/01/2023
 */

package edu.nicole.fluxo;
import java.util.Scanner; 

public class diaDaSemana{
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("...............................");
        System.out.println("Descobrindo os dias da semana ");
        System.out.println("...............................\n");
        
        System.out.println("Digite o dia da semana em questão: ");
        String diaSemana = entrada.next();

        switch(diaSemana){

            case "Domingo":
                System.out.println("1");
                break;

            case "Segunda":
                System.out.println("2");
                break;

            case "Terça":
                System.out.println("3");
                break;

            case "Quarta":
                System.out.println("4");
                break;

            case "Quinta":
                System.out.println("5");
                break;

            case "Sexta":
                System.out.println("6");
                break;

            case "Sábado":
                System.out.println("7");
                break;

            default:
                System.out.println("Dia da semana inexistente");

            
        }
        


    }
}