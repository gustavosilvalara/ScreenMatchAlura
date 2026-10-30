package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2008);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(filmeDoPaulo);
        listaAssistidos.add(lost);

        for(Titulo item: listaAssistidos){
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        System.out.println();

        List<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Rúi Barbosa");
        buscaPorArtistas.add("Gustavo");
        System.out.println(buscaPorArtistas);

        System.out.println("Depois da ordenação");
        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);
        System.out.println("Titulos sem ordenação");
        System.out.println(listaAssistidos);
        System.out.println("Titulos Ordenados");
        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);
        System.out.println("Ordenado por Ano");
        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaAssistidos);
    }
}
