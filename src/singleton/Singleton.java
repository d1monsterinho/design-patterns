package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public String getSingletonInstanceHash() {
        return "I'm a singleton instance with hash: " + hashCode();
    }
}
