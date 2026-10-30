package br.com.alura.screenmatch.desafioapi.aula01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDB {
    static void main() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome de uma receita: ");
        String busca = sc.nextLine();
        String chave = "/1/";
        String endereco = "https://www.themealdb.com/api/json/v1" + chave + "search.php?s=" + busca;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)).build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
