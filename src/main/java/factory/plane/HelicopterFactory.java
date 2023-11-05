package factory.plane;

import flight.reservation.plane.Aircraft;
import flight.reservation.plane.Helicopter;

public class HelicopterFactory implements PlaneFactory{
    @Override
    public Aircraft createPlane(String model) {
        int passengerCapacity;
        if (model.equals("H1")) {
            passengerCapacity = 4;
        } else if (model.equals("H2")) {
            passengerCapacity = 6;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        return new Helicopter(model, passengerCapacity);
    }
}
