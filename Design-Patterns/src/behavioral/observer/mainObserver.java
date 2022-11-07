package behavioral.observer;
/**
 Nesse Pattern, tem-se dois agentes principais: O Observer (interessado evento) e o Subject (Que monitora e notifica
 sobre o evento). Poderiamos também citar o Client (o que dispara o evento).
 O Subject espera que um determinado evento aconteça para então notificar o Observer.
 Nesse exemplo (Festa de aniversário surpresa), o Evento é a chegada do aniversariante, o Subject é o Porteiro que avisa
 o Observer que é a namorada do aniversariante.
 */
public class mainObserver {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.start();
    }
}
