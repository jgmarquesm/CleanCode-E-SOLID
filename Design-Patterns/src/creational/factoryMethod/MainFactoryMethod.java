package creational.factoryMethod;

import java.util.Scanner;

/**
 * Nesse Pattern,
    - Delegamos a criação de instância de objetos para subclasses, ou seja, substituí-se as chmadas diretas (new ...)
        de contrutores para um método que faz intermédio, fazendo o papel de Fábrica. Os objetos retornados da Fábrica
         são chamados de Produto ou de Classes Concretas. O Factory Method na Classe Base deve ter a Interface como tipo
        de retorno.
    - Implementamos com base em abstrações (Interfaces e Abstract Classes).

 Nesse exemplo, a classe Transporte faz o papel de Fábrica.
 */
public class MainFactoryMethod {
    private static Transporte transporte;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("""
        Digite uma opção:
        - 1: Uber
        - 2: Logs
        - 3: Eats
        """);
        String opcao = entrada.next();

        switch (opcao){
            case "1" -> configure("uber");
            case "2" -> configure("log");
            case "3" -> configure("eats");
            default -> configure("error");
        }

        if (transporte != null){
            runTransporte();
        }
    }

    private static void runTransporte() {
        transporte.iniciarTransposrte();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber" -> transporte = new TransporteCarro();
            case "log" -> transporte = new TransporteMoto();
            case "eats" -> transporte = new TransporteBike();
            default -> System.out.println("Selecione o tipo de entrega.");
        }
    }
}
