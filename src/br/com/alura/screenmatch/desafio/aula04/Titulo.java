package br.com.alura.screenmatch.desafio.aula04;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String titulo){
        this.nome = titulo;
    }


    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo nome) {
        return this.nome.compareTo(nome.getNome());

    }
}
