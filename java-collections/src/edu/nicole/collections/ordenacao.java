package edu.nicole.collections;

/**
 * @author Nicole Silva
 * @since 19/02/2023
 */

import java.util.*;

 public class ordenacao{
    public static void main(String[] args) {
        
        List <Gato> gatos = new ArrayList<>(){{
            add(new Gato("Bobo",12, "preto" ));
            add(new Gato("Tob",8, "caramelo" ));
            add(new Gato("Bob",1, "cinza" ));
            add(new Gato("Josh",7, "branco" ));

        }};

        Collections.sort(gatos);
        System.out.println(gatos);

    }

 }

 class Gato implements Comparable <Gato>{

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    
    public String getCor() {
        return cor;
    }

   @Override
   public String toString(){
    return "Nome: " + this.getNome() + " Idade: " + this.getIdade() + " Cor: " + this.getCor() + "\n";
    
   }        

    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

