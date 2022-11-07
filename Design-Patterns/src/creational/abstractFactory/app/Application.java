package creational.abstractFactory.app;

import creational.abstractFactory.factories.TransporteFactory;
import creational.abstractFactory.veiculos.veiculosAereos.VeiculosAereos;
import creational.abstractFactory.veiculos.veiculosTerrestres.VeiculosTerrestres;

public class Application {
    private VeiculosTerrestres veiculosTerrestres;
    private VeiculosAereos veiculosAereos;

    public Application(TransporteFactory factory){
        veiculosTerrestres = factory.criarVeiculoterrestre();
        veiculosAereos = factory.criarVeiculosAereos();
    }

    public  void iniciarRota(){
        veiculosTerrestres.iniciarRota();
        veiculosAereos.iniciarRota();
    }
}
