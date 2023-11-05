import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Stack<Command> getHistory() {
        return history;
    }
}
