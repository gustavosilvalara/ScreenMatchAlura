package br.com.alura.screenmatch.desafioapi.aula03;

import java.util.Scanner;

public class Senha {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = input.nextLine();
        try {
            if(senha.length() < 8) {
                throw new SenhaInvalidaException("\nERROR: Senha menor que 8 caracteres");
            }
            System.out.println("Senha valida!!");
        }catch (SenhaInvalidaException erro) {
            System.out.println("Senha invalida " + erro.getMessage());
        }
    }
}
