package creational.builder.builders;

import creational.builder.carros.Carro;
import creational.builder.componentes.Combustivel;
import creational.builder.componentes.Motor;
import creational.builder.componentes.TipoCarro;
import creational.builder.componentes.Transmissao;

public class CarroBuilder implements Builder{

    private TipoCarro tipoCarro;
    private int quantidadeDeAssentos;
    private Motor motor;
    private Transmissao TIPO_TRANSMISSAO;
    private String cor;
    private int aro;
    private Combustivel TIPO_COMBUSTIVEL;

    @Override
    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao TIPO_TRANSMISSAO) {
        this.TIPO_TRANSMISSAO = TIPO_TRANSMISSAO;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setAroRoda(int aro) {
        this.aro = aro;
    }

    @Override
    public void setCombustivel(Combustivel TIPO_COMBUSTIVEL) {
        this.TIPO_COMBUSTIVEL = TIPO_COMBUSTIVEL;
    }

    public Carro getResult(){
        return new Carro(tipoCarro, quantidadeDeAssentos, motor, TIPO_TRANSMISSAO, cor, aro, TIPO_COMBUSTIVEL);
    }
}
