package creational.builder.director;

import creational.builder.builders.Builder;
import creational.builder.componentes.Combustivel;
import creational.builder.componentes.Motor;
import creational.builder.componentes.TipoCarro;
import creational.builder.componentes.Transmissao;

public class Director {
    Builder builder;

    public void montarSedan(Builder builder){
        builder.setTipoCarro(TipoCarro.SEDAN);
        builder.setQuantidadeDeAssentos(5);
        builder.setMotor(new Motor(1.8));
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setCor("Azul");
        builder.setAroRoda(15);
        builder.setCombustivel(Combustivel.FLEX);
    }

    public void montarEsportivo(Builder builder){
        builder.setTipoCarro(TipoCarro.ESPORTIVO);
        builder.setQuantidadeDeAssentos(2);
        builder.setMotor(new Motor(5.5));
        builder.setTransmissao(Transmissao.AUTOMATICA);
        builder.setCor("Amarelo");
        builder.setAroRoda(18);
        builder.setCombustivel(Combustivel.GASOLINA);
    }

    public void montarSUV(Builder builder){
        builder.setTipoCarro(TipoCarro.SUV);
        builder.setQuantidadeDeAssentos(7);
        builder.setMotor(new Motor(3));
        builder.setTransmissao(Transmissao.AUTOMATICA);
        builder.setCor("Prata");
        builder.setAroRoda(20);
        builder.setCombustivel(Combustivel.DIESEL);
    }

    public void montarPickup(Builder builder){
        builder.setTipoCarro(TipoCarro.PICKUP);
        builder.setQuantidadeDeAssentos(2);
        builder.setMotor(new Motor(1.4));
        builder.setTransmissao(Transmissao.MANUAL);
        builder.setCor("Branca");
        builder.setAroRoda(14);
        builder.setCombustivel(Combustivel.FLEX);
    }


    public void montarHatch(Builder builder){
        builder.setTipoCarro(TipoCarro.HATCH);
        builder.setQuantidadeDeAssentos(5);
        builder.setMotor(new Motor(1.6));
        builder.setTransmissao(Transmissao.AUTOMATICA);
        builder.setCor("Cinza");
        builder.setAroRoda(15);
        builder.setCombustivel(Combustivel.FLEX);
    }
}
