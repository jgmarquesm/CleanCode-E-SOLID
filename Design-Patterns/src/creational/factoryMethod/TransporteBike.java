package creational.factoryMethod;

import creational.factoryMethod.veiculos.Bike;
import creational.factoryMethod.veiculos.Veiculo;

public class TransporteBike extends Transporte{
    @Override
    protected Veiculo criarTransporte() {
        return new Bike();
    }
}
