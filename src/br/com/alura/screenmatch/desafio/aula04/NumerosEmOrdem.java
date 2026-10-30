package br.com.alura.screenmatch.desafio.aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumerosEmOrdem {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 1, 10, 50, 2, 6, 9, 300, 5, 3, 8, 7, 4);
        System.out.println("Lista sem ordem \n" + numeros);
        numeros.sort(Integer::compareTo);
        System.out.println("Lista em ordem \n" + numeros);

    }
}
