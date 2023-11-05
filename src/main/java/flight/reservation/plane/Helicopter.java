package flight.reservation.plane;

public class Helicopter extends Aircraft {

    private final int passengerCapacity;

    public Helicopter(String model, int passengerCapacity) {
        this.setModel(model);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
