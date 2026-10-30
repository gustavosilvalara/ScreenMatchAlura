package br.com.alura.screenmatch.desafio.aula05.meudesafio;

import br.com.alura.screenmatch.desafio.aula05.meudesafio.modelos.CartaoDeCredito;
import br.com.alura.screenmatch.desafio.aula05.meudesafio.modelos.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Informe o saldo do cartão: ");
        double saldo = s.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(saldo);

        if (cartao.getSaldo() == 0) {
            System.out.print("Sem limite para compras ");
        }

        System.out.print("Informe o nome do produto: ");
        s.nextLine();
        String descricao = s.nextLine();
        Produto produto = new Produto(descricao);
        System.out.print("Informe o valor do produto: ");
        double valor = s.nextDouble();
        produto.setValor(valor)
        ;
        if (produto.getValor() > cartao.getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            cartao.setSaldo(cartao.getSaldo() - produto.getValor());
            produtos.add(produto);

            System.out.println("Deseja comprar mais produtos? 1 = sim 0 = não");
            int opcao = sc.nextInt();
            while (opcao == 1) {
                System.out.print("Informe o nome do produto: ");
                s.nextLine();
                String descricao1 = s.nextLine();
                Produto produto1 = new Produto(descricao1);
                System.out.print("Informe o valor do produto: ");
                double valor1 = s.nextDouble();
                produto1.setValor(valor1);

                if (produto1.getValor() > cartao.getSaldo()) {
                    System.out.println("Saldo insuficiente");
                    break;
                }
                else {
                    produtos.add(produto1);
                    cartao.setSaldo(cartao.getSaldo() - produto1.getValor());
                    System.out.println("Deseja comprar mais produtos? 1 = sim 0 = não");
                    opcao = sc.nextInt();
                }
            }
        }
        cartao.setProdutos(produtos);
        System.out.println("********* Produtos Comprados **************");
        Collections.sort(cartao.getProdutos());
        for (Produto comprados : cartao.getProdutos()){
            System.out.println(comprados);
        }
        System.out.println("*******************************************");
        System.out.println("Saldo restante " +  cartao.getSaldo());
        s.close();
        sc.close();
        }
}