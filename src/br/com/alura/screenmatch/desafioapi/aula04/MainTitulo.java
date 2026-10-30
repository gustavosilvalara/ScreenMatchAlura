package br.com.alura.screenmatch.desafioapi.aula04;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainTitulo {
    static void main() {
        Titulo titulo = new Titulo("Alura", 5000, true);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String tituloJson = gson.toJson(titulo);
        System.out.println(tituloJson);
    }
}
