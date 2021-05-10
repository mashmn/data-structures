package designpatterns.creational.singleton;

/**
 * Initialization-on-demand holder idiom is a lazy-loaded Singleton.
 *
 * Since the class initialization phase is guaranteed by the JLS (within JVM by the Java Language Specialization) to
 * be sequential, i.e. non-concurrent, no further synchronization is required in the static getInstance method during
 * loading and initialization.
 *
 * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 */
public class LazyLoadedSingleton {
    private LazyLoadedSingleton() {}

    private static class LazyHolder {
        static final LazyLoadedSingleton INSTANCE = new LazyLoadedSingleton();
    }

    public static LazyLoadedSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static int numTracks = 5;
    public static void startTracks()
    {
        for(int i=0;i<numTracks;++i)
        {
            System.out.println("Here we are");
        }
    }

    public static void main (String[] args) {
        LazyLoadedSingleton lLS = new LazyLoadedSingleton().getInstance();
        lLS.startTracks();
        LazyLoadedSingleton lLS2 = new LazyLoadedSingleton().getInstance();
        lLS2.startTracks();
    }
}
