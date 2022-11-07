package creational.builder;

import creational.builder.builders.Builder;
import creational.builder.builders.CarroBuilder;
import creational.builder.carros.Carro;
import creational.builder.director.Director;

/**
 Nesse Pattern, quebramos a construção de um objeto complexo, em várias construções de objetos menos complexo.
 Existem 2 principais agentes nesse padrão: O Builder (monta o objeto) e o Director (conhece a sequencia de montagem,
 o passo a passo).
 Nesse exemplo, vamos simular uma fábrica de carros onde são fabricados carros com várias caracteristicas distinas.
 */
public class MainBuilder {
    public static void main(String[] args) {

        Director diretor = new Director();

        CarroBuilder construtorSedan = new CarroBuilder();
        diretor.montarSedan(construtorSedan);
        Carro sedan = construtorSedan.getResult();
        System.out.println(sedan);

        CarroBuilder construtorEsportivo = new CarroBuilder();
        diretor.montarEsportivo(construtorEsportivo);
        Carro esportivo = construtorEsportivo.getResult();
        System.out.println(esportivo);

        CarroBuilder construtorSUV = new CarroBuilder();
        diretor.montarSUV(construtorSUV);
        Carro suv = construtorSUV.getResult();
        System.out.println(suv);

        CarroBuilder construtorPickup = new CarroBuilder();
        diretor.montarPickup(construtorPickup);
        Carro pickUp = construtorPickup.getResult();
        System.out.println(pickUp);

        CarroBuilder construtorHatch = new CarroBuilder();
        diretor.montarHatch(construtorHatch);
        Carro hatch = construtorHatch.getResult();
        System.out.println(hatch);
    }
}
