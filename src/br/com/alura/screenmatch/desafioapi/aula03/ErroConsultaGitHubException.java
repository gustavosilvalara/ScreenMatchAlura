package br.com.alura.screenmatch.desafioapi.aula03;

public class ErroConsultaGitHubException extends RuntimeException {
    private String mensagem;
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }

    public String getMensagem() {
        return mensagem;
    }
}
