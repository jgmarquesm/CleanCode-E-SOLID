package structural.bridge.transmissao;

import structural.bridge.plataformas.Plataforma;

public class Live implements Transmissao{

    protected Plataforma plataforma;

    public Live(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando Transmissão...");
    }

    @Override
    public void result() {
        System.out.println(">>> NO AR <<<");
    }
}
