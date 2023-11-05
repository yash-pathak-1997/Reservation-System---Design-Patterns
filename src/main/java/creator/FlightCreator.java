package creator;

import flight.reservation.Airport;
import flight.reservation.flight.Flight;
import flight.reservation.plane.Aircraft;

import java.util.Arrays;
import java.util.List;

public class FlightCreator extends Creator{

    private final List<Flight> flights;

    public FlightCreator(List<Airport> airports, List<Aircraft> aircrafts){
        flights = Arrays.asList(
                new Flight(1, airports.get(0), airports.get(1), aircrafts.get(0)),
                new Flight(2, airports.get(1), airports.get(2), aircrafts.get(1)),
                new Flight(3, airports.get(2), airports.get(4), aircrafts.get(2)),
                new Flight(4, airports.get(3), airports.get(2), aircrafts.get(3)),
                new Flight(5, airports.get(4), airports.get(2), aircrafts.get(4)),
                new Flight(6, airports.get(5), airports.get(7), aircrafts.get(5))
        );
    }

    public List<Flight> getList() {
        return flights;
    }
}
