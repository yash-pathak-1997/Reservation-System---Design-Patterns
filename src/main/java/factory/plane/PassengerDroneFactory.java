package factory.plane;

import flight.reservation.plane.Aircraft;
import flight.reservation.plane.PassengerDrone;

public class PassengerDroneFactory implements PlaneFactory{

    public Aircraft createPlane(String model) {
        if (!model.equals("HypaHype")) {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
        return new PassengerDrone(model);
    }
}
