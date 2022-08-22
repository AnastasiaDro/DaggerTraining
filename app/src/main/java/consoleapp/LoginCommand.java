package consoleapp;

import javax.inject.Inject;

final class LoginCommand extends SingleArgCommand {
    private final Outputter outputter;

    @Inject
    LoginCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "login";
    }

    @Override
    public Command.Status handleArg(String username) {
        outputter.output(username + " is logged in.");
        return Command.Status.HANDLED;
    }
}
