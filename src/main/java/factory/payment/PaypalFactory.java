package factory.payment;

import flight.reservation.payment.Payment;
import flight.reservation.payment.Paypal;
import java.util.Arrays;
import java.util.List;

public class PaypalFactory implements PaymentFactory{

    public Payment createPayment() {
        List <String> usernames = Arrays.asList("amanda@ya.com", "john@amazon.eu");
        List <String> passwords = Arrays.asList("amanda1985", "qwerty");
        return new Paypal(usernames, passwords);
    }
}
