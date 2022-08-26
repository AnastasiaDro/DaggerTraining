package consoleapp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;


final class CommandRouter {

    /**
     * In order for Dagger to know how to create a CommandRouter,
     * we also need to add an @Inject annotation to its constructor:
     * Dagger also will create instanse of HelloWorldCommand
     */

    /**
     * To take advantage of this, we can switch CommandRouter’s constructor
     * parameter to Map<String, Command>.
     * Notice that Command on its own won’t work anymore.
     */
    private final Map<String, Command> commands;
    private final Outputter outputter;
    @Inject
    CommandRouter(Map<String, Command> commands, Outputter outputter) {
        this.commands = commands;
        this.outputter = outputter;
    }

    /**
     * Calls {@link Command#handleInput(String) command.handleInput(input)} on this router's
     * {@linkplain #commands commands}.
     */
    Command.Result route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        List<String> args = splitInput.subList(1, splitInput.size());
        Command.Result result = command.handleInput(args);
        return result.status().equals(Command.Status.INVALID) ? invalidCommand(input) : result;
    }

    private Command.Result invalidCommand(String input) {
        outputter.output(String.format("couldn't understand \"%s\". please try again.", input));
        return Command.Result.invalid();
    }

    private static List<String> split(String input) {
        return Arrays.asList(input.trim().split("\\s+"));
    }
}