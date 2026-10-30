package br.com.alura.screenmatch.desafio.aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    static void main() {
        List<Integer> numeros;
        numeros = new ArrayList();
        Collections.addAll(numeros, 1,2,3,6,10,5,9,7,8,200);
        System.out.println("Lista sem ordenação no ArrayList " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista com ordenação no ArrayList " + numeros);
        numeros = new LinkedList<>();
        Collections.addAll(numeros, 1,2,3,6,10,5,9,7,8,200,100);
        Collections.sort(numeros);
        System.out.println("Lista como LinkedList ordenada " + numeros);
    }
}
