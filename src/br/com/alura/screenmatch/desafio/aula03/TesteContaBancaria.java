package br.com.alura.screenmatch.desafio.aula03;

import java.util.ArrayList;
import java.util.Collections;

public class TesteContaBancaria {
    static void main() {


        ArrayList<ContaBancaria> contaBancarias = new ArrayList<>();
        ContaBancaria contaBancaria1 = new ContaBancaria(1, 50.50);
        ContaBancaria contaBancaria2 = new ContaBancaria(6, 100.20);
        ContaBancaria contaBancaria3 = new ContaBancaria(7, 20.05);
        ContaBancaria contaBancaria4 = new ContaBancaria(5, 200.25);

        Collections.addAll(contaBancarias, contaBancaria1,contaBancaria2,contaBancaria3,contaBancaria4);

        double maiorValor = 0;

        double menorValor = contaBancarias.get(1).getSaldo();

        for (ContaBancaria listaContaBancaria : contaBancarias){
            if (maiorValor < listaContaBancaria.getSaldo()){
                maiorValor = listaContaBancaria.getSaldo();
            }
            if (menorValor > listaContaBancaria.getSaldo()){
                menorValor = listaContaBancaria.getSaldo();
            }
        }
        System.out.println("O maior valor das contas é " + maiorValor);
        System.out.println("O menor valor das contas é " + menorValor);
    }
}
