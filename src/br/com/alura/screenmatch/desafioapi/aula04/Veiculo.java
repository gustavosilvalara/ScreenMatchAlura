package br.com.alura.screenmatch.desafioapi.aula04;

public class Veiculo {
    private String nome;
    private String marca;
    private String modelo;
    private int potencia;
    private double valor;
    private int serie;

    public Veiculo(String nome, String marca, String modelo, int potencia, double valor, int serie) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.valor = valor;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Veiculo " +
                "nome = " + nome +
                ", marca = " + marca +
                ", modelo = " + modelo +
                ", potencia = " + potencia +
                ", valor = " + valor +
                ", serie = " + serie;
    }
}
