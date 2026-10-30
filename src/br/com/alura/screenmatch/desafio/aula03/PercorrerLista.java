package br.com.alura.screenmatch.desafio.aula03;

import java.util.ArrayList;

public class PercorrerLista {
    static void main() {
    ArrayList<String> ListaNomes = new ArrayList<>();
    ListaNomes.add("Gabriel");
    ListaNomes.add("Gustavo");
    ListaNomes.add("Erick");
    ListaNomes.add("João");

    ListaNomes.forEach(System.out::println);
    }
}
