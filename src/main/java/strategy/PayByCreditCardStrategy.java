package strategy;

import flight.reservation.order.Order;
import flight.reservation.payment.CreditCard;
import flight.reservation.payment.Payment;

public class PayByCreditCardStrategy implements PayStrategy{
    @Override
    public boolean payOrder(Payment payment, Order order) {
        CreditCard card = (CreditCard) payment;
        if (cardIsPresentAndValid(card)) {
            System.out.println("Paying " + order.getPrice() + " using Credit Card.");
            double remainingAmount = card.getAmount() - order.getPrice();
            if (remainingAmount < 0) {
                System.out.printf("Card limit reached - Balance: %f%n", remainingAmount);
                throw new IllegalStateException("Card limit reached");
            }
            card.setAmount(remainingAmount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean processOrder(Payment payment, Order order) {
        CreditCard creditCard = (CreditCard) payment;
        if (order.isClosed()) {
            // Payment is already proceeded
            return true;
        }
        // validate payment information
        if (!cardIsPresentAndValid(creditCard)) {
            throw new IllegalStateException("Payment information is not set or not valid.");
        }
        boolean isPaid = payOrder(creditCard, order);
        if (isPaid) {
            order.setClosed();
        }
        return isPaid;
    }

    private boolean cardIsPresentAndValid(CreditCard card) {
        return card != null && card.isValid();
    }

}
