package edu.nicole.desafio;

public class Curso extends Conteudo {
    
 
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){

        return "Titulo: " +
            getTitulo() + 
            "\nDescrição: " +
            getDescricao() + "\nCarga Horária: " + 
            this.cargaHoraria;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}

