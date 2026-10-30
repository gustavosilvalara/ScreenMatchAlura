package br.com.alura.screenmatch.desafioapi.aula04;

import java.io.FileWriter;
import java.io.IOException;

public class GravarTexto {
    static void main() {
        try {
            FileWriter fw = new FileWriter("arquivo.txt");
            fw.write("Utilize as classes do pacote java.io.!!");
            fw.close();
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo.txt");
            e.printStackTrace();
        }
    }
}
