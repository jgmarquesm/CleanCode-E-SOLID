package creational.factoryMethod.veiculos;

public class Carro implements Veiculo {
    @Override
    public void iniciarRota() {
        pegarCarga();
        System.out.println("Iniciando o trajeto.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Pegamos os passageiros, estamos prontos.");
    }
}
