package structural.adapter.adapters;

import structural.adapter.payoneer.Payoneer;
import structural.adapter.paypal.PayPalPayments;
import structural.adapter.utils.Token;

public class PayoneerAdapter implements PayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando Payoneer.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void PayPalPayment() {
        this.token = authToken();
        this.payoneer.sendPayments();
    }

    @Override
    public void PayPalReceive() {
        this.payoneer.receivePayments();
    }
}
