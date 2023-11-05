package flight.reservation.plane;

public class PassengerPlane extends Aircraft{

    private final int passengerCapacity;
    private final int crewCapacity;

    public PassengerPlane(String model, int passengerCapacity, int crewCapacity) {
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
        this.setModel(model);
    }


    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }
}
