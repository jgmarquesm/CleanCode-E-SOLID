package creational.abstractFactory;

import creational.abstractFactory.app.Application;
import creational.abstractFactory.factories.NineNineTransporte;
import creational.abstractFactory.factories.TransporteFactory;
import creational.abstractFactory.factories.UberTransporte;
import java.util.Scanner;

/**
 Esse Pattern é de certa forma semelhante ao Factory Method, entretanto, nesse Pattern é adicionamos mais uma camada de
 abstrção, por isso o nome Abstract Factory.
 Nesse exemplo, vamos expandir o exemplo feito no Factory method adicionando mais uma opção de delivery além da Uber, o
 99 (NineNine). Para melhor visualização, a Uber fará entregas apenas de Carro e Avião e a 99 fará entregas apenas de Moto e
 Helicoptero.
 */
public class MainAbstractFactory {
    public static Application configureApplication(String empresa){
        Application app;
        TransporteFactory factory;

        if (empresa.equalsIgnoreCase("uber")){
            factory = new UberTransporte();
        } else {
            factory = new NineNineTransporte();
        }

        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {

        Application iniciarApp;
        boolean condition = true;

        while (condition){
            Scanner entrada = new Scanner(System.in);
            System.out.println("""
        Digite uma opção:
        - 1: Uber
        - 2: 99
        """);
            String opcao = entrada.next();

            switch (opcao){
                case "1" ->  {iniciarApp = configureApplication("uber");
                    iniciarApp.iniciarRota();
                    condition = false;
                }
                case "2" -> {iniciarApp = configureApplication("99");
                    iniciarApp.iniciarRota();
                    condition = false;
                }
                default -> System.out.println("Opção inválida: " + opcao);
            }
        }
    }
}
