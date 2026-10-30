package br.com.alura.screenmatch.desafioapi.aula02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainPessoa {
    static void main() {
        Pessoa pessoa1 = new Pessoa("Gustavo", 21,"São Paulo");
        Pessoa pessoa2 = new Pessoa("Goreth", 55,null);
        Gson gson = new GsonBuilder().create();

        String jsonPessoa1 = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        String jsonPessoa2 = "{\"nome\":\"Rodrigo\",\"idade\":20}";

        System.out.println("Pessoa convertida para JSON");

        String json1 = gson.toJson(pessoa1);
        String json2 = gson.toJson(pessoa2);

        System.out.println(json1);
        System.out.println(json2);

        System.out.println("Json convertido para Pessoa");

        Pessoa pessoaConvertido1 = gson.fromJson(json1, Pessoa.class);
        Pessoa pessoaConvertido2 = gson.fromJson(json2, Pessoa.class);
        Pessoa pessoaConvertido3 = gson.fromJson(jsonPessoa1,Pessoa.class);
        Pessoa pessoaConvertido4 = gson.fromJson(jsonPessoa2,Pessoa.class);

        System.out.println(pessoaConvertido1);
        System.out.println(pessoaConvertido2);
        System.out.println(pessoaConvertido3);
        System.out.println(pessoaConvertido4);
    }
}
