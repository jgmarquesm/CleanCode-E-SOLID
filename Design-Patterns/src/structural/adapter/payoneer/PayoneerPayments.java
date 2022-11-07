package structural.adapter.payoneer;

import structural.adapter.utils.Token;

public interface PayoneerPayments {
    Token authToken();
    void sendPayments();
    void receivePayments();
}
