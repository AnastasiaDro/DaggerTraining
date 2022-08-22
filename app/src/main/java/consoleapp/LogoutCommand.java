package consoleapp;

import javax.inject.Inject;

public class LogoutCommand extends SingleArgCommand{
    private final Outputter outputter;

    @Inject
    LogoutCommand(Outputter outputter) { this.outputter = outputter;}

//
//    @Override
//    public String key() { return "logout"; }

    @Override
    protected Status handleArg(String username) {
        outputter.output(username + " logged out.");
        return Status.HANDLED;
    }
}
