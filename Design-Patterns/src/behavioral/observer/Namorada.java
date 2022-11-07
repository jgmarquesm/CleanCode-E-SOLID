package behavioral.observer;

public class Namorada implements ChegadaAniversarianteObserver{
    @Override
    public void chegou(ChegadaAniversarianteEvent evento) {
        System.out.println("Apagem as luzes!");
        System.out.println("Façam Silêncio...");
        System.out.println("SURPRESAAAA");
    }
}
