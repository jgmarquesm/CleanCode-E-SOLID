package creational.abstractFactory.veiculos.veiculosTerrestres;

public class Moto implements VeiculosTerrestres{
    @Override
    public void iniciarRota() {
        pegarCarga();
        System.out.println("Iniciando a entrega.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Já pegamos as encomendas. Estamos prontos.");
    }
}
