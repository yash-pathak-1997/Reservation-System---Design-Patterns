package factory.payment;

import flight.reservation.payment.CreditCard;
import flight.reservation.payment.Payment;

import java.util.Date;

public class CreditCardFactory implements PaymentFactory {

    public Payment createPayment(int amount, String number, Date date, String cvv) {
        return new CreditCard(amount, number, date, cvv);
    }

}
