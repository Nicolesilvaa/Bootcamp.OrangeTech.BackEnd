 /** @author Nicole Silva
  *  @since 09/01/2023

  Este programa
 */

package edu.nicole.fluxo;
import java.util.Scanner; 

public class nota{

    /*Este método ler notas até que elas estejam dentro do intervalo [0,10] */
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        
        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        while( nota < 0 || nota > 10){

            System.out.println("Nota inválida! Digite novamente");
            nota = scanner.nextInt();

        }
    }
}