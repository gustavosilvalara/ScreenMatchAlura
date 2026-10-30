package br.com.alura.screenmatch.desafio.aula03;

import java.util.ArrayList;

public class TesteArea {
    static void main() {
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        Circulo circulo1 = new Circulo(2);
        Quadrado quadrado1 = new Quadrado(5);
        listaDeFormas.add(circulo1);
        listaDeFormas.add(quadrado1);

        for (Forma lista : listaDeFormas){
            lista.calcularArea();
        }
    }
}
