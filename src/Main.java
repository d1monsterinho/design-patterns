import builder.BuilderClient;
import prototype.PrototypeClient;
import singleton.SingletonClient;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        testPrototypeImplementation();
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

    private static void testPrototypeImplementation() {
        PrototypeClient client = new PrototypeClient();
        client.clonePrototypeAndPrintEqualityTest();
    }
}