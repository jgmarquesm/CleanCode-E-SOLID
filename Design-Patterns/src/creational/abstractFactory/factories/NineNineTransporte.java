package creational.abstractFactory.factories;

import creational.abstractFactory.veiculos.veiculosAereos.Helicoptero;
import creational.abstractFactory.veiculos.veiculosAereos.VeiculosAereos;
import creational.abstractFactory.veiculos.veiculosTerrestres.Moto;
import creational.abstractFactory.veiculos.veiculosTerrestres.VeiculosTerrestres;

public class NineNineTransporte implements TransporteFactory {
    @Override
    public VeiculosTerrestres criarVeiculoterrestre() {
        return new Moto();
    }

    @Override
    public VeiculosAereos criarVeiculosAereos() {
        return new Helicoptero();
    }
}
