 /** @author Nicole Silva
  *  @since 09/01/2023
 */

package edu.nicole.fluxo;
import java.util.Scanner; 

public class fluxoControle{
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        int nota = scanner.nextInt();

        while( nota < 0 || nota > 10){

            System.out.println("Nota inválida! Digite novamente");
            nota = scanner.nextInt();

        }
    }
}