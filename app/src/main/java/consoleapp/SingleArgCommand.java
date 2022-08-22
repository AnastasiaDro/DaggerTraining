package consoleapp;

import java.util.List;

import javax.xml.transform.Result;

abstract class SingleArgCommand implements Command {

    @Override
    public final Status handleInput(List<String> input) {
        return input.size() == 1 ? handleArg(input.get(0)) : Status.INVALID;
    }

    /** Handles the single argument to the command. */
    protected abstract Status handleArg(String arg);
}
