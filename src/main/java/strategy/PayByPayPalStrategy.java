package strategy;

import flight.reservation.order.Order;
import flight.reservation.payment.Payment;
import flight.reservation.payment.Paypal;

public class PayByPayPalStrategy implements PayStrategy {

    @Override
    public boolean payOrder(Payment payment, Order order) {
        Paypal paypal = (Paypal) payment;
        if (order.getCustomer().getEmail().equals(Paypal.DATA_BASE.get(password))) {
            System.out.println("Paying " + order.getPrice() + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean processOrder(Payment payment, Order order) {
        if (order.isClosed()) {
            // Payment is already proceeded
            return true;
        }
        // validate payment information
        if (order.getCustomer().getEmail() == null || password == null || !order.getCustomer().getEmail().equals(Paypal.DATA_BASE.get(password))) {
            throw new IllegalStateException("Payment information is not set or not valid.");
        }
        boolean isPaid = payOrder(payment, order);
        if (isPaid) {
            order.setClosed();
        }
        return isPaid;
    }

    String password = "qwerty";
}
