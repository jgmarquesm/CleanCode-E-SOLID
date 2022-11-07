package structural.adapter.paypal;

import structural.adapter.utils.Token;

public interface PayPalPayments {
    Token authToken();
    void PayPalPayment();
    void PayPalReceive();
}
