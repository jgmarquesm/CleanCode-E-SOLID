package creational.factoryMethod;

import creational.factoryMethod.veiculos.Veiculo;

public abstract class Transporte {

    void iniciarTransposrte(){
        Veiculo veiculo = criarTransporte();
        veiculo.iniciarRota();
    }

    protected abstract Veiculo criarTransporte();
}
