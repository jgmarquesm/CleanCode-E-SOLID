package structural.adapter.adapters;

import structural.adapter.mercadoPago.MercadoPago;
import structural.adapter.paypal.PayPalPayments;
import structural.adapter.utils.Token;

public class MercadoPagoAdapter implements PayPalPayments {

    private Token token;
    private MercadoPago mercadoPago;
    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando Mercado Pago.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void PayPalPayment() {
        this.token = authToken();
        this.mercadoPago.paymentsMercadoPago();
    }

    @Override
    public void PayPalReceive() {
        this.mercadoPago.receivesMercadoPago();
    }
}
