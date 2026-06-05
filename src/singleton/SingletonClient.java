package singleton;

public class SingletonClient {
    private Singleton singleton;

    public SingletonClient() {
        singleton = Singleton.getInstance();
    }

    public void printSingletonHash() {
        System.out.println(singleton.getSingletonInstanceHash());
    }

    public Singleton getSingleton() {
        return singleton;
    }

    public void setSingleton(Singleton singleton) {
        this.singleton = singleton;
    }
}
