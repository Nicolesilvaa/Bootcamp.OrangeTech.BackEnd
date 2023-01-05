package edu.nicole.sintaxe;

public class MinhaClasse{

    public static void main(String[] args){


        System.out.println("Nessa aula aprendemos as estruturas básicas de uma classe em Java");

        
        String primeiroNome = "Nicole";
        String segundoNome = "Silva";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return primeiroNome.concat(" ").concat(segundoNome);
    }
}