package consoleapp;

import dagger.Binds;
import dagger.Module;

@Module
abstract class HelloWorldModule {


    /**
     * This @Binds method tells Dagger that when something depends on a Command,
     * Dagger should provide a HelloWorldCommand object in its place.
     *
     * @param command
     * @return
     */
    @Binds //helloWorldCommand(HelloWorldCommand command);
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
