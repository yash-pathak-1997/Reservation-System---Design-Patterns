package strategy;

import flight.reservation.order.Order;
import flight.reservation.payment.Payment;

public interface PayStrategy {
    boolean payOrder(Payment payment, Order order);

    boolean processOrder(Payment payment, Order order);
}
