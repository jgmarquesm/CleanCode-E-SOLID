package structural.adapter.paypal;

import structural.adapter.utils.Token;

public class PayPal implements PayPalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void PayPalPayment() {
        this.token = authToken();
        System.out.println("Enviando Pagamentos com PayPal.");
    }

    @Override
    public void PayPalReceive() {
        System.out.println("Recebendo Pagamentos com PayPal.");
    }
}
