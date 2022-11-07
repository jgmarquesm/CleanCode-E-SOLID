package creational.builder.carros;

import creational.builder.componentes.Combustivel;
import creational.builder.componentes.Motor;
import creational.builder.componentes.TipoCarro;
import creational.builder.componentes.Transmissao;

public class Carro {

    private TipoCarro tipoCarro;
    private int qtdAssentos;
    private Motor motor;
    private Transmissao transmissao;
    private String cor;
    private int aroRoda;
    private Combustivel combustivel;

    public Carro(TipoCarro tipoCarro, int qtdAssentos, Motor motor, Transmissao transmissao, String cor, int aroRoda, Combustivel combustivel) {

        this.tipoCarro = tipoCarro;
        this.qtdAssentos = qtdAssentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.cor = cor;
        this.aroRoda = aroRoda;
        this.combustivel = combustivel;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public String getCor() {
        return cor;
    }

    public int getAroRoda() {
        return aroRoda;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoCarro=" + tipoCarro +
                ", qtdAssentos=" + qtdAssentos +
                ", motor=" + motor.getPotencia() +
                ", transmissao=" + transmissao +
                ", cor='" + cor + '\'' +
                ", aroRoda=" + aroRoda +
                ", combustivel=" + combustivel +
                '}';
    }
}
