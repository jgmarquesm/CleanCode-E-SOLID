package creational.builder.builders;

import creational.builder.componentes.Combustivel;
import creational.builder.componentes.Motor;
import creational.builder.componentes.TipoCarro;
import creational.builder.componentes.Transmissao;

public interface Builder {

    void setTipoCarro(TipoCarro tipoCarro);
    void setQuantidadeDeAssentos(int quantidadeDeAssentos);
    void setMotor(Motor motor);
    void setTransmissao(Transmissao TIPO_TRANSMISSAO);
    void setCor(String cor);
    void setAroRoda(int aro);
    void setCombustivel(Combustivel TIPO_COMBUSTIVEL);
}
