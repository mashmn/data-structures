package designpatterns.creational.singleton;

/**
 * Eager Initialization - always creates an instance
 * will impact startup time performance, but it may help improve the runtime performance of the app
 */
public class SingletonClassEager {
    /**
     * final keyword ensures the class to actually be a singleton - only one instance exists.
     */
    private static final SingletonClassEager INSTANCE = new SingletonClassEager();

    private SingletonClassEager() {}

    public static SingletonClassEager getInstance() {
        return INSTANCE;
    }
}
