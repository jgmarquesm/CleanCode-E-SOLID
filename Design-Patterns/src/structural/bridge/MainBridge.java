package structural.bridge;

import structural.bridge.plataformas.Facebook;
import structural.bridge.plataformas.Plataforma;
import structural.bridge.plataformas.TwitchTV;
import structural.bridge.plataformas.Youtube;
import structural.bridge.transmissao.AdvancedLive;
import structural.bridge.transmissao.Live;

/**
 Nesse Pattern, podemos dividir uma Classe grande ou um conjunto grande de classes intimamente ligadas em classes menores
 através de 2 níveis de hierarquia: Abstração e Implementação.
 Abstração:
    - Camada de controle de alto nível.
    - Não deve fazer nenhum tipo de trabalho por conta própria.
    - Delega o trabalho para a camada de implementação.
 Implementação:
    - Camada de baixo nível.
    - Faz o trabalho delegado pela abstração.
 */
public class MainBridge {
    public static void main(String[] args) {
        System.out.println(">>> Lives Simples <<<");

        iniciarLiveSimples(new Youtube());
        System.out.println("-----------------------------------");
        iniciarLiveSimples(new TwitchTV());
        System.out.println("-----------------------------------");
        iniciarLiveSimples(new Facebook());
        System.out.println("-----------------------------------");

        System.out.println(">>> Lives Avançadas <<<");

        iniciarLiveAvancada(new Youtube());
        System.out.println("-----------------------------------");
        iniciarLiveAvancada(new TwitchTV());
        System.out.println("-----------------------------------");
        iniciarLiveAvancada(new Facebook());
    }

    public static void iniciarLiveSimples(Plataforma plataforma){
        System.out.println("Preparando a transmissão...");
        Live live = new Live(plataforma);
        live.broadcasting();
        live.result();
    }

    public static void iniciarLiveAvancada(Plataforma plataforma){
        System.out.println("Preparando a transmissão...");
        AdvancedLive live = new AdvancedLive(plataforma);
        live.broadcasting();
        live.habilitarComentarios();
        live.habilitarLegandas();
        live.result();
    }
}
