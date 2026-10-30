package br.com.alura.screenmatch.desafioapi.aula01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    static void main() throws IOException, InterruptedException {
        Scanner livro = new Scanner(System.in);
        String chave = "AIzaSyC4cWTAQeEur91mixPN4qHyqh8gjYS5rcg";
        System.out.println("Digite o nome do livro: ");
        String busca = livro.nextLine();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=" + chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
