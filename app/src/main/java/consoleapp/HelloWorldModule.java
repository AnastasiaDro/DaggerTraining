package consoleapp;

import dagger.Binds;
import dagger.Module;

/**
 * Modules are collections of binding methods
 * Unlike @Inject, which goes directly on a class’s constructor, @Binds methods must be inside a module.
 */
@Module
abstract class HelloWorldModule {


    /**
     * This @Binds method tells Dagger that when something depends on a Command,
     * Dagger should provide a HelloWorldCommand object in its place.
     *
     * @param command
     * @return
     */

    //The method is abstract because just its declaration is enough to tell Dagger what to do.

    @Binds //helloWorldCommand(HelloWorldCommand command);
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
