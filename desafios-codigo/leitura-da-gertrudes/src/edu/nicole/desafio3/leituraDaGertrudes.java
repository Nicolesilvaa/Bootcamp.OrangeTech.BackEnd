package edu.nicole.desafio3;

/**
 * @author Nicole Silva
 * @since 11/01/2023
 */

import java.util.Scanner; 
    
public class leituraDaGertrudes {

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        int tempo;
        int paginasLidas = 3;

        System.out.println("Olá Gertrudes! Quantas páginas tem o seu livro ? ");
        int paginas = leitor.nextInt();
        
        
        tempo =  paginas / paginasLidas;
        System.out.println("A previsão é de que você termine ele em " + tempo + " dias ");
      

    }
}