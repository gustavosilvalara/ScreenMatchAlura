package br.com.alura.screenmatch.desafio.aula03;

public class Quadrado implements Forma{
    private final double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("A área de um quadrado é " + area);
    }
}
