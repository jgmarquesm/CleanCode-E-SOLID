package creational.abstractFactory.veiculos.veiculosTerrestres;

public class Carro implements VeiculosTerrestres{
    @Override
    public void iniciarRota() {
        pegarCarga();
        System.out.println("Iniciando trajeto.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Pegamos os passageiros. Estamos prontos.");
    }
}
