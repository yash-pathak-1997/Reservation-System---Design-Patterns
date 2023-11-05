import java.util.List;

public abstract class Command {

    public Runner runner;

    public Command(Runner runner){
        this.runner = runner;
    }
    public abstract <T> List<T> execute();
}
