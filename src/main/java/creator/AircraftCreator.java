package creator;

import factory.plane.HelicopterFactory;
import factory.plane.PassengerDroneFactory;
import factory.plane.PassengerPlaneFactory;
import factory.plane.PlaneFactory;
import flight.reservation.plane.Aircraft;

import java.util.Arrays;
import java.util.List;

public class AircraftCreator extends Creator{

    public static PlaneFactory passengerPlaneFactory = new PassengerPlaneFactory();
    public static PlaneFactory helicopterFactory = new HelicopterFactory();
    public static PlaneFactory passengerDroneFactory = new PassengerDroneFactory();

    private final List<Aircraft> aircrafts;
    public AircraftCreator(){
        this.aircrafts = Arrays.asList(
                passengerPlaneFactory.createPlane("A380"),
                passengerPlaneFactory.createPlane("A350"),
                passengerPlaneFactory.createPlane("Embraer 190"),
                passengerPlaneFactory.createPlane("Antonov AN2"),
                helicopterFactory.createPlane("H1"),
                passengerDroneFactory.createPlane("HypaHype")
        );
    }

    public List<Aircraft> getList() {
        return aircrafts;
    }
}
