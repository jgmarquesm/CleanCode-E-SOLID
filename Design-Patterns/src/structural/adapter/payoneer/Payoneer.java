package structural.adapter.payoneer;

import structural.adapter.utils.Token;

public class Payoneer implements PayoneerPayments{
    private Token token;
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayments() {
        this.token = authToken();
        System.out.println("Enviando Pagamentos com Payoneer.");
    }

    @Override
    public void receivePayments() {
        System.out.println("Recebendo Pagamentos com Payoneer.");
    }
}
