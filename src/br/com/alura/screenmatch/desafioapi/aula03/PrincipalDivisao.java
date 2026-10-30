package br.com.alura.screenmatch.desafioapi.aula03;

import java.util.Scanner;

public class PrincipalDivisao {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("************** Divisão **************");
        System.out.print("Informe o valor do dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Informe o valor do divisor: ");
        int divisor = input.nextInt();
        try {
            double resultado = (double) dividendo / divisor;
            System.out.println("Resultado: " + resultado);
      }catch (ArithmeticException erro) {
          System.out.println("Divisor está zerado: " + erro.getMessage());
      }
    }
}
