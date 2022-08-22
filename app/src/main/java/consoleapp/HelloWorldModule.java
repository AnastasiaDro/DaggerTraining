package consoleapp;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

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
     * The @StringKey annotation, combined with @IntoMap, tells Dagger
     * how to populate a Map<String, Command>. Note that our Command
     * interface no longer needs a key() method because we’re telling
     * Dagger what the key is directly.
     *
     * @IntoMap allows for the creation of a map with values of a specific type, with keys set using special annotations such as @StringKey or @IntKey. Because keys are set via annotation, Dagger ensures that multiple values are not mapped to the same key.
     * @IntoSet allows for the creation of a set of types to be collected together. It can be used together with @Binds and @Provides methods to provide a Set<ReturnType>.
     * @IntoMap and @IntoSet are both ways of introducing what is often called “multibindings”, where a collection contains elements from several different binding methods.
     *
     * @param command
     * @return
     */

    //The method is abstract because just its declaration is enough to tell Dagger what to do.

    @Binds //helloWorldCommand(HelloWorldCommand command);
    @IntoMap
    @StringKey("hello")
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
