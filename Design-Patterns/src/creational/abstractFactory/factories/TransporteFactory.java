package creational.abstractFactory.factories;

import creational.abstractFactory.veiculos.veiculosAereos.VeiculosAereos;
import creational.abstractFactory.veiculos.veiculosTerrestres.VeiculosTerrestres;

public interface TransporteFactory {

    VeiculosTerrestres criarVeiculoterrestre();

    VeiculosAereos criarVeiculosAereos();
}
