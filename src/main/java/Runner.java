import creator.AircraftCreator;
import creator.AirportCreator;
import creator.Creator;
import creator.FlightCreator;
import factory.plane.HelicopterFactory;
import factory.plane.PassengerDroneFactory;
import factory.plane.PassengerPlaneFactory;
import factory.plane.PlaneFactory;
import flight.reservation.Airport;
import flight.reservation.flight.Schedule;
import flight.reservation.flight.Flight;
import flight.reservation.plane.Aircraft;

import java.util.Arrays;
import java.util.List;

public class Runner implements Runnable {

    private final CommandHistory history = new CommandHistory();

    static List<Airport> airports;

    static List<Aircraft> aircrafts;

    static List<Flight> flights;

    public static void init(Creator creator){
        airports = creator.getList();
        aircrafts = creator.next_step.getList();
        flights = creator.next_step.next_step.getList();
    }

    static Schedule schedule;

    public static void main(String[] args) {

        Creator creator = Creator.link(
                new AircraftCreator(),
                new AirportCreator(),
                new FlightCreator(new AirportCreator().getList(), new AircraftCreator().getList())
        );
        init(creator);
    }

    public void executeCommand(Command command){
        if(command.execute().size() != 0){
            history.push(command);
        }
    }

    @Override
    public void run() {
        this.executeCommand(new GetAllAircraftsCommand(this));
        this.executeCommand(new GetAllFlightsCommand(this));
        this.executeCommand(new GetAllAirportsCommand(this));
        Object command_history = this.history.getHistory();
        System.out.println(command_history);
    }

    public List<Aircraft> getAircrafts() {
        return null;
    }

    public List<Airport> getAirports() {
        return null;
    }

    public List<Flight> getFlights() {
        return null;
    }
}
