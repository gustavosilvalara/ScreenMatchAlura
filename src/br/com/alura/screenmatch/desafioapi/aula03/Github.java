package br.com.alura.screenmatch.desafioapi.aula03;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Github {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o usuario do GitHub: ");
        String usuario = input.nextLine();
        String chave = "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";
        String endereco = "https://api.github.com/users/" + usuario;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Authorization", "Bearer" + chave)
                    .header("Accept", "application/vnd.github+json")
                    .header("User-Agent", "Java-HttpClient")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuario não encontrado!!!");
            }

            String json = response.body();
            System.out.println(json);

        }catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
        }catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
