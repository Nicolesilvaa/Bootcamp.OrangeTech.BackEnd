package edu.nicol.poo;

/**
 * @author Nicole Silva
 * @since 13/01/2003
 */

class Carro extends veiculos{

    //Atributos da classe carro
    String modelo;  
    String cor;
    int capacidadeTanque;

    //Criando um método construtor
    carro(){

    }

    //Sobrecarga de construtor
    carro(Sting cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
}

    void setCor(String cor){
        this.cor = cor;

    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;

    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int setCapacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;

    }

    Int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;

    }


