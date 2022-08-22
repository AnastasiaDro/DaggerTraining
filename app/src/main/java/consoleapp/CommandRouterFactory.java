package consoleapp;

import dagger.Component;

//Component is a feature for creating instances

/**CommandRouterFactory is a normal factory type for CommandRouters.
 Its implementation would call new CommandRouter() instead of our
 main method doing it. But instead of us writing the implementation
 of CommandRouterFactory, we can annotate it with @Component to have
 Dagger generate an implementation for us: DaggerCommandRouterFactory.
 Note that it has a static create() method to give us an instance to use.


 * Говоря проще, эта аннотация сама генерит за нас фабрику CommandRouter-ов
 * и эта фабрика может возвращать инстанс этой фабрики
 */
@Component(modules = {LoginCommandModule.class, SystemOutModule.class})
interface CommandRouterFactory {
    CommandRouter router();
}
