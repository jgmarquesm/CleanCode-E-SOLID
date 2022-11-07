package creational.factoryMethod;

import creational.factoryMethod.veiculos.Moto;
import creational.factoryMethod.veiculos.Veiculo;

public class TransporteMoto extends Transporte{
    @Override
    protected Veiculo criarTransporte() {
        return new Moto();
    }
}
