package flight.reservation.payment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Paypal extends Payment {
    public static final Map<String, String> DATA_BASE = new HashMap<>();

    public Paypal(List<String> usernames, List <String> passwords){
        for (int i = 0; i < usernames.size(); i++) {
            DATA_BASE.put(usernames.get(i), passwords.get(i));
        }
    }

}
