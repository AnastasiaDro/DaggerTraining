package consoleapp;

import java.util.List;

abstract class SingleArgCommand implements Command {

    @Override
    public final Result handleInput(List<String> input) {
        return input.size() == 1 ? handleArg(input.get(0)) : Result.invalid();
    }

    /** Handles the single argument to the command.
     * @return*/
    protected abstract Result handleArg(String arg);
}
