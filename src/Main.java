import builder.BuilderClient;
import singleton.SingletonClient;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        testBuilderImplementation();
    }

    private static void testSingletonImplementation() {
        SingletonClient client = new SingletonClient();
        client.printSingletonHash();

        client.setSingleton(Singleton.getInstance());
        client.printSingletonHash();
    }

    private static void testBuilderImplementation() {
        BuilderClient client = new BuilderClient();
        client.createRegularGamingDesktopAndPrint();
    }
}