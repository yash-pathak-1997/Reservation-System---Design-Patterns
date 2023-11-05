package factory.plane;
import flight.reservation.plane.Aircraft;

public interface PlaneFactory {

    Aircraft createPlane(String model);
}
