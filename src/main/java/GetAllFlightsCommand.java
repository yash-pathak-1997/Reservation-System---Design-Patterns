import flight.reservation.flight.Flight;

import java.util.List;

public class GetAllFlightsCommand extends Command{
    public GetAllFlightsCommand(Runner runner) {
        super(runner);
    }

    @Override
    public List<Flight> execute() {
        return runner.getFlights();
    }
}
