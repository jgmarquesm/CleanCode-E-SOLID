package structural.bridge.transmissao;

import structural.bridge.plataformas.Plataforma;

public class AdvancedLive extends Live{

    public AdvancedLive(Plataforma plataforma) {
        super(plataforma);
    }

    public void habilitarLegandas(){
        System.out.println("Legendas Habilitadas");
    }

    public void habilitarComentarios(){
        System.out.println("Comentários Habilitados. Diga o que está achando da Live!");
    }
}
