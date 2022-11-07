package creational.abstractFactory.veiculos.veiculosAereos;

public class Aviao implements VeiculosAereos{
    @Override
    public void iniciarRota() {
        vento();
        pegarCarga();
        System.out.println("Iniciando a decolagem.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Passageiros a bordo. Decolagem autorizada.");
    }

    @Override
    public void vento() {
        System.out.println("Velocidade do vento: 25Km/h. Tudo certo para decolagem");
    }
}
