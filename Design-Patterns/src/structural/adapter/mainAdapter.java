package structural.adapter;

import structural.adapter.adapters.MercadoPagoAdapter;
import structural.adapter.adapters.PayoneerAdapter;
import structural.adapter.mercadoPago.MercadoPago;
import structural.adapter.payoneer.Payoneer;
import structural.adapter.paypal.PayPal;
import structural.adapter.paypal.PayPalPayments;

/**
 Nesse Pattern, o objetivo é converter a interface de um objeto de maneira que outro objeto possa compreender as informações.
 Permitindo assim que interfaces incompatíveis, trabalhem juntas.
 Nesse exemplo, vamos simular a agregação de formas de pagamento em um sistema que já suporta pagamento via PayPal.
 Antes:
     - PayPal
        PayPalPayments paymentsPayPal = new PayPal();
        paymentsPayPal.PayPalPayment();
        paymentsPayPal.PayPalReceive();
     - Payoneer:
        PayoneerPayments paymentsPayoneer = new Payoneer();
        paymentsPayoneer.sendPayments();
        paymentsPayoneer.receivePayments();
     - Mercado Pago:
         MercadoPagoPayments paymentsMercadoPago = new MercadoPagoPayments();
         paymentspaymentsMercadoPago.paymentsMercadoPago();
         paymentspaymentsMercadoPago.receivesMercadoPago();
 Agora:
 */
public class mainAdapter {
    public static void main(String[] args) {

        PayPalPayments paymentsPayPal = new PayPal();
        paymentsPayPal.PayPalPayment();
        paymentsPayPal.PayPalReceive();

        System.out.println("-----------------------------------------");

        PayPalPayments paymentsPayoneer = new PayoneerAdapter(new Payoneer());
        paymentsPayoneer.PayPalPayment();
        paymentsPayoneer.PayPalReceive();

        System.out.println("-----------------------------------------");

        PayPalPayments paymentsMercadoPago = new MercadoPagoAdapter(new MercadoPago());
        paymentsMercadoPago.PayPalPayment();
        paymentsMercadoPago.PayPalReceive();
    }
}
