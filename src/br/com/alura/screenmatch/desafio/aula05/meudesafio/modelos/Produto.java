package br.com.alura.screenmatch.desafio.aula05.meudesafio.modelos;

public class Produto implements Comparable<Produto>{
    private String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Produto valor) {
        return Double.compare(this.valor, valor.getValor());
    }

    @Override
    public String toString() {
        return this.descricao + " R$" + this.valor;
    }
}
