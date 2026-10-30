package br.com.alura.screenmatch.desafioapi.aula05.resolucao;

public record Endereco(String cep, String logradouro,
                       String complemento, String bairro,
                       String localidade, String uf) {
}