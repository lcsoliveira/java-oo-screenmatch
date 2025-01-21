package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // Como serie e filme são um Titulo devido a herança meu parâmetro pode ser um titulo
    public void inclui (Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


    // Sobrecarga de métodos, mesmo método que recebe parâmetros diferentes porém o código ficou duplciado
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//       this.tempoTotal += s.getDuracaoEmMinutos();
//    }
}
