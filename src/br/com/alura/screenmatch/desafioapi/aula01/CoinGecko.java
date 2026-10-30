package br.com.alura.screenmatch.desafioapi.aula01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    static void main() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a criptomoeda que deseja buscar: ");
        String busca = sc.nextLine();
        String chave = "CG-pSbQMu1ypKAAjJqvWMr1pFju";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=" + busca + "&x_cg_demo_api_key=" + chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString()) ;
        System.out.println(response.body());
    }
}
