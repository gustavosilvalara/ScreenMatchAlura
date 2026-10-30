package br.com.alura.screenmatch.desafio.aula05.meudesafio.modelos;

import java.util.List;

public class CartaoDeCredito{

    private double saldo;
    private List<Produto> produtos;

    public CartaoDeCredito(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
