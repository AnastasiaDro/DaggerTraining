package consoleapp;

import dagger.Module;
import dagger.Provides;

/**
 * Here we’ve created another @Module, but instead of a @Binds method we have a @Provides method.
 * A @Provides method works a lot like an @Inject constructor: here it tells
 * Dagger that when it needs an instance of Outputter, it should call SystemOutModule.textOutputter() to get one.
 */
@Module
public class SystemOutModule {
    @Provides
    static Outputter textOutputter() {
        return System.out::println;
    }

}
