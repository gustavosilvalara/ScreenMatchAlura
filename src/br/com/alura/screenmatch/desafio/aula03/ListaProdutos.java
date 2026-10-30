package br.com.alura.screenmatch.desafio.aula03;

import java.util.ArrayList;

public class ListaProdutos {
    static void main() {
        Produto produto1 = new Produto("Caneta", 1.80);
        Produto produto2 = new Produto("Lapis", 1.00);
        Produto produto3 = new Produto("Lapiseira", 1.40);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaValor = 0;
        for (Produto produto : listaProdutos ){
         somaValor += produto.getValor();
        }
        double valorMedio = somaValor / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + valorMedio);
    }
}
