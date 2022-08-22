package consoleapp;

import dagger.Binds;
import dagger.Module;

@Module
abstract class LogoutCommandModule {
    @Binds
    abstract Command logoutCommand(LogoutCommand command);
}
