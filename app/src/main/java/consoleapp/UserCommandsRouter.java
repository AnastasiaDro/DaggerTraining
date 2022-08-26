package consoleapp;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;

@Subcomponent(modules = UserCommandsModule.class)
public interface UserCommandsRouter {
    CommandRouter router();

    /**
     * The @Subcomponent.Factory annotation annotates a factory type for this subcomponent. It’s an interface we define.
     * It has a single method that creates an instance of the subcomponent.
     * That method has a @BindsInstance parameter, which tells Dagger
     * that the Account instance we pass as an argument should be requestable
     * by any @Inject constructor, @Binds method, or @Provides method in this subcomponent.
     */
    @Subcomponent.Factory
    interface Factory {
        UserCommandsRouter create(@BindsInstance Database.Account account);
    }

    @Module (subcomponents = UserCommandsRouter.class)
    interface InstallationModule {}
}
/**
 * We have a module that declares the subcomponent. Including this module
 * in another component will make the @Subcomponent.Factory
 * available there. That’s our bridge between the two components.
 */
