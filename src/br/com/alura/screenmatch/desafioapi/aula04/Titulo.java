package br.com.alura.screenmatch.desafioapi.aula04;

public class Titulo {
    private String nome;
    private double duracao;
    private boolean ativo;

    public Titulo(String nome, double duracao, boolean ativo) {
        this.nome = nome;
        this.duracao = duracao;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Titulo " +
                "nome = " + nome +
                ", duracao = " + duracao +
                ", ativo = " + ativo;
    }
}
