package creational.abstractFactory.factories;

import creational.abstractFactory.veiculos.veiculosAereos.Aviao;
import creational.abstractFactory.veiculos.veiculosAereos.VeiculosAereos;
import creational.abstractFactory.veiculos.veiculosTerrestres.Carro;
import creational.abstractFactory.veiculos.veiculosTerrestres.VeiculosTerrestres;

public class UberTransporte implements TransporteFactory {
    @Override
    public VeiculosTerrestres criarVeiculoterrestre() {
        return new Carro();
    }

    @Override
    public VeiculosAereos criarVeiculosAereos() {
        return new Aviao();
    }
}
