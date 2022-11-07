package behavioral.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread{
    private boolean condition = true;
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void run(){
        Scanner entrada = new Scanner(System.in);

        while (condition){
            int opcao = entrada.nextInt();
            if (opcao == 1){
                ChegadaAniversarianteEvent evento = new ChegadaAniversarianteEvent(new Date());

                for (ChegadaAniversarianteObserver observer: this.observers){
                    observer.chegou(evento);
                }
                condition = false;
            } else {
                System.out.println("Alarme falso.");
            }
        }
    }
}
