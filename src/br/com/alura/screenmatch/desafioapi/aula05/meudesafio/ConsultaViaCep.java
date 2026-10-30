package br.com.alura.screenmatch.desafioapi.aula05.meudesafio;

public class ConsultaViaCep {
    private String cep;
    private String uf;
    private String cidade;
    private String logradouro;

    public ConsultaViaCep() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep.length() == 8) {
            this.cep = cep;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf.length() == 2) {
            this.uf = uf;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade.length() > 3) {
            this.cidade = cidade;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro.length() > 3) {
            this.logradouro = logradouro;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
