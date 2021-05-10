package designpatterns.creational.singleton;

/**
 * Lazy Initialization - restricts creation of instance until it is requested for the first time.
 *
 * To make this thread safe - getInstance() class synchronized
 *
 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 */
public class SingletonClass {
    private static SingletonClass instance = null;

    /**
     * Constructor made private to disallow any other way to initiate the class.
     */
    private SingletonClass() { }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
