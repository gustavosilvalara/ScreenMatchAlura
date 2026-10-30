package br.com.alura.screenmatch.desafio.aula03;

public class Circulo implements Forma{

    private final double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = raio * 3.14;
        System.out.println("O raio do circulo é " + area);
    }
}
