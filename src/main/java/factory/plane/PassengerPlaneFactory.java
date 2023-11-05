package factory.plane;
import flight.reservation.plane.Aircraft;
import flight.reservation.plane.PassengerPlane;

public class PassengerPlaneFactory implements PlaneFactory{

    public Aircraft createPlane(String model) {
        int passengerCapacity;
        int crewCapacity;
        switch (model) {
            case "A380":
                passengerCapacity = 500;
                crewCapacity = 42;
                break;
            case "A350":
                passengerCapacity = 320;
                crewCapacity = 40;
                break;
            case "Embraer 190":
                passengerCapacity = 25;
                crewCapacity = 5;
                break;
            case "Antonov AN2":
                passengerCapacity = 15;
                crewCapacity = 3;
                break;
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        return new PassengerPlane(model, passengerCapacity, crewCapacity);
    }
}
