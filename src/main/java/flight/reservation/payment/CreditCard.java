package flight.reservation.payment;

import java.util.Date;

/**
 * Dummy credit card class.
 */
public class CreditCard extends Payment {
    private double amount;
    private final String number;
    private final Date date;
    private final String cvv;
    private boolean valid;

    public CreditCard(int amount, String number, Date date, String cvv) {
        this.amount = amount;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.setValid();

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid() {
        // Dummy validation
        this.valid = number.length() > 0 && date.getTime() > System.currentTimeMillis() && !cvv.equals("000");
    }
}