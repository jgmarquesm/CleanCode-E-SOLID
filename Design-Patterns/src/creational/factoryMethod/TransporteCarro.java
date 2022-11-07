package creational.factoryMethod;

import creational.factoryMethod.veiculos.Carro;
import creational.factoryMethod.veiculos.Veiculo;

public class TransporteCarro extends Transporte{
    @Override
    protected Veiculo criarTransporte() {
        return new Carro();
    }
}
