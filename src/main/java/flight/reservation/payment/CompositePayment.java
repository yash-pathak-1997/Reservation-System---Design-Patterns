package flight.reservation.payment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositePayment extends Payment {

    protected List<Payment> children = new ArrayList<>();

    public void add(Payment... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Payment child) {
        children.remove(child);
    }

    public void remove(Payment... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

}
