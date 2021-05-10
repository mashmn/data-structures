package designpatterns.creational.singleton;

/**
 * Enum is a globally accessible. Drawback is that enum type is somewhat inflexible and does not allow lazy
 * initialization
 */
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        /* do something here */
    }

}
