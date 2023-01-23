package edu.nicol.poo;

/**
 * @author Nicole Silva
 * @since 15/01/2023
 * 
 * Aplicando  conceitos de herança
 */

 class Main{

    public static void main(String[] args) {
        
      Veiculos veiculo = new Veiculos(); //Criando novo objeto

      Veiculos carro = new Carro(); // Fazendo upcast

      Veiculos carro = (Veiculos) new carro(); // Downcast

    }
 }