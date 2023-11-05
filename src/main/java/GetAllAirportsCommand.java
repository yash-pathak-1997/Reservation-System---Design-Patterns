import flight.reservation.Airport;

import java.util.List;

public class GetAllAirportsCommand extends Command{
    public GetAllAirportsCommand(Runner runner) {
        super(runner);
    }

    @Override
    public List<Airport> execute() {
        return runner.getAirports();
    }
}
