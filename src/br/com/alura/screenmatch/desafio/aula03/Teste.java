package br.com.alura.screenmatch.desafio.aula03;

public class Teste {
    static void main() {
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
        if ( cachorro instanceof Animal){
            System.out.println("Cachorro é animal");
        }

    }
}
