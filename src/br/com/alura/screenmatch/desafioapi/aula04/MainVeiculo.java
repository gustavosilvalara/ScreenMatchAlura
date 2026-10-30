package br.com.alura.screenmatch.desafioapi.aula04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class MainVeiculo {
    static void main() {
        Veiculo veiculo = new Veiculo("Astra", "Chrevolet", "Carro", 128,25432.20,23121);
        Gson gs = new GsonBuilder().setPrettyPrinting().create();
        String veiculoJson = gs.toJson(veiculo);
        System.out.println(veiculoJson);

        try {
            FileWriter fw = new FileWriter("Carros.txt");
            fw.write(veiculoJson);
            System.out.println("Carro gravado com sucesso!");
            fw.close();
        }catch(IOException e) {
            System.out.println("Erro ao escrever carro!!!");
            e.printStackTrace();
        }


    }
}
