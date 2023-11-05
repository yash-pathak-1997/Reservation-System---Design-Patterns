import flight.reservation.plane.Aircraft;

import java.util.List;

public class GetAllAircraftsCommand extends Command {

    public GetAllAircraftsCommand(Runner runner){
        super(runner);
    }

    @Override
    public List<Aircraft> execute() {
        return runner.getAircrafts();
    }
}
