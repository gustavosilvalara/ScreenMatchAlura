package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        super(mensagem);
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
