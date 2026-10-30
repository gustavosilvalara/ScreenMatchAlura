package br.com.alura.screenmatch.desafio.aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteTitulo {
    static void main() {
        Titulo titulo1 = new Titulo("Lost");
        Titulo titulo2 = new Titulo("As branquelas");
        Titulo titulo3 = new Titulo("Born");
        Titulo titulo4 = new Titulo("Chuck");

        List<Titulo> titulos = new ArrayList<>();
        Collections.addAll(titulos, titulo1, titulo2, titulo3, titulo4);
        System.out.println("Sem ordenação = " + titulos);
        Collections.sort(titulos);
        System.out.println("Com ordenação = " + titulos);
    }
}
