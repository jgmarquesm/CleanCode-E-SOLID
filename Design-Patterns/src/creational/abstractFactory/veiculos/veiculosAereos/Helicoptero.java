package creational.abstractFactory.veiculos.veiculosAereos;

public class Helicoptero implements VeiculosAereos{
    @Override
    public void iniciarRota() {
        vento();
        pegarCarga();
        System.out.println("Iniciando a decolagem.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Passageiros a bordo. Ligando helices.");
    }

    @Override
    public void vento() {
        System.out.println("Velocidade do vento: 15Km/h. Pode decolar!");
    }
}