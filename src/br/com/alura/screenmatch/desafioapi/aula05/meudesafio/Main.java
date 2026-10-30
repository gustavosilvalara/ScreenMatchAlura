package br.com.alura.screenmatch.desafioapi.aula05.meudesafio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main() throws IOException {
        String respostaDaConsulta;
        ConsultaViaCep consultaViaCep = new ConsultaViaCep();
        ConexaoConsultaViaCep conexaoConsultaViaCep = new ConexaoConsultaViaCep();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();


        Scanner sc = new Scanner(System.in);
        Scanner cep = new Scanner(System.in);
        Scanner cidade = new Scanner(System.in);
        Scanner logradouro = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("********* Buscador de CEP *********");
            System.out.println("1 - Procurar rua pelo cep");
            System.out.println("2 - Procurar pela rua o cep");
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o CEP: ");
                    try {
                        consultaViaCep.setCep(cep.nextLine());
                    }catch (IllegalArgumentException e){
                        System.out.println("Digite um cep válido");
                        continue;
                    }
                    respostaDaConsulta = conexaoConsultaViaCep.buscarRuaPeloCep(consultaViaCep.getCep());
                    geradorDeArquivo.gravarJson(respostaDaConsulta);
                    System.out.println(respostaDaConsulta);
                    break;

                case 2:
                    System.out.println("Digite a UF, Cidade e Logradouro");
                    try {
                        consultaViaCep.setUf(sc.next());
                        consultaViaCep.setCidade(cidade.nextLine());
                        consultaViaCep.setLogradouro(logradouro.nextLine());
                    }catch (IllegalArgumentException e){
                        System.out.println("Digite o endereço correto");
                        continue;
                    }
                    respostaDaConsulta = conexaoConsultaViaCep.buscarPeloEndereco(consultaViaCep.getUf(),
                            consultaViaCep.getCidade(),
                            consultaViaCep.getLogradouro());
                    geradorDeArquivo.gravarJson(respostaDaConsulta);
                    System.out.println(respostaDaConsulta);
                    break;
            }
        }
    }
}
