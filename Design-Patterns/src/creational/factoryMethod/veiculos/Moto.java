package creational.factoryMethod.veiculos;

public class Moto implements Veiculo {
    @Override
    public void iniciarRota() {
        pegarCarga();
        System.out.println("Iniciando a entrega.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Já pegamos a encomenda.");
    }
}
