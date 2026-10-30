package br.com.alura.screenmatch.desafioapi.aula05.meudesafio;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoConsultaViaCep {
    HttpClient client = HttpClient.newHttpClient();

    public String buscarRuaPeloCep(String cep){
        try {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            HttpRequest request = HttpRequest
                    .newBuilder(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não conseguimos buscar o endereço");
        }

    }

    public String buscarPeloEndereco(String uf, String cidade, String logradouro){
        cidade = cidade.replace(" ", "%20");
        logradouro = logradouro.replace(" ", "%20");

        try {
            String url = "https://viacep.com.br/ws/" + uf + "/" + cidade + "/" + logradouro + "/json/";
            HttpRequest request = HttpRequest
                    .newBuilder(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não conseguimos buscar o endereço");
        }

    }
}
