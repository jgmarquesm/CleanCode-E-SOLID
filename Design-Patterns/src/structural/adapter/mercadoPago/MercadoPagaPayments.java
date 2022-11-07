package structural.adapter.mercadoPago;

import structural.adapter.utils.Token;

public interface MercadoPagaPayments {

    Token authToken();
    void paymentsMercadoPago();
    void receivesMercadoPago();
}
