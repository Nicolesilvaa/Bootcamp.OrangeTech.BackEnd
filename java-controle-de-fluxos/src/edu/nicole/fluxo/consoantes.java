package edu.nicole.fluxo;
import  java.util.Scanner; 

public class consoantes{

    /*Este método ler 6 caracteres e diz quais consoantes foram lidas*/

    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        String [] armazenaConsoantes = new String[6];
        String letra = " ";
        
        System.out.println("Digite as letras : ");
        for(int i = 0; i < 6; i++){

            letra = scanner.next();

            if( letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") | 
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u") )

                armazenaConsoantes[i] = letra;
                
        }

        for(String consoantes: armazenaConsoantes)

            if(consoantes != null)
                System.out.println(consoantes + " ");

        
        
    }
}
