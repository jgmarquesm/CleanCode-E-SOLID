package creational.factoryMethod.veiculos;

public class Bike implements Veiculo{
    @Override
    public void iniciarRota() {
        pegarCarga();
        System.out.println("Iniciando o delivery.");
    }

    @Override
    public void pegarCarga() {
        System.out.println("Já pegamos a comida.");
    }
}
