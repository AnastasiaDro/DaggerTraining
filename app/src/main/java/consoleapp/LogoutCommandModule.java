package consoleapp;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
abstract class LogoutCommandModule {
    @Binds
    @IntoMap
    @StringKey("logout")
    abstract Command logoutCommand(LogoutCommand command);
}
