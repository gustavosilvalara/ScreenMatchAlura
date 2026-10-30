package br.com.alura.screenmatch.desafioapi.aula03;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }

    public String getMensagem() {
        return mensagem;
    }
}
