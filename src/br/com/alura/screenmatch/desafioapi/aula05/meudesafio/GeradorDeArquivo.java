package br.com.alura.screenmatch.desafioapi.aula05.meudesafio;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void gravarJson(String consultaViaCep) throws IOException {
        FileWriter fw = new FileWriter(".txt");
        fw.write(consultaViaCep);
        fw.close();
    }
}
