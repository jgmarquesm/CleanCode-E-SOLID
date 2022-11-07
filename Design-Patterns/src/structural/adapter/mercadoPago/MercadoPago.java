package structural.adapter.mercadoPago;

import structural.adapter.utils.Token;

public class MercadoPago implements MercadoPagaPayments {

    private Token token;
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paymentsMercadoPago() {
        this.token = authToken();
        System.out.println("Enviando Pagamentos com Mercado Pago.");
    }

    @Override
    public void receivesMercadoPago() {
        System.out.println("Recebendo Pagamentos com Mercado Pago.");
    }
}
