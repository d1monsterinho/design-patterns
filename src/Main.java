import adapter.AdapterClient;
import adapter.EuPlug;
import adapter.UsSocket;
import adapter.UsSocketAdapter;
import builder.BuilderClient;
import chainofresponsibility.WebHandlerClient;
import command.RepoClient;
import decorator.DecoratorClient;
import flyweight.FlyweightClient;
import prototype.PrototypeClient;
import proxy.ProxyClient;
import singleton.SingletonClient;
import singleton.Singleton;
import strategy.LLMContextClient;
import templatemethod.DOCsMiner;
import templatemethod.FileMiner;
import templatemethod.PDFMiner;

public class Main {
    public static void main(String[] args) {
        testTemplateMethodImplementation();
    }

    private static void testTemplateMethodImplementation() {
        FileMiner pdfMiner = new PDFMiner();
        pdfMiner.processFile("PDF file");

        FileMiner docsMiner = new DOCsMiner();
        docsMiner.processFile("DOCs file");
    }

    private static void testStrategyImplementation() {
        LLMContextClient client = new LLMContextClient();
        client.generateLLMsResponses();
    }

    private static void testCommandImplementation() {
        RepoClient client = new RepoClient();
        client.makeCommitAndRevert();
    }

    private static void testCoRImplementation() {
        WebHandlerClient client = new WebHandlerClient();
        client.auth();
    }

    private static void testProxyImplementation() {
        ProxyClient client = new ProxyClient();
        client.renderCLStatsInfo();
    }

    private static void testFlyweightImplementation() {
        FlyweightClient client = new FlyweightClient();
        client.moveCars();
    }

    private static void testDecoratorImplementation() {
        DecoratorClient client = new DecoratorClient();
        client.composeAndPrintDecoratedPizza();
    }

    private static void testAdapterImplementation() {
        AdapterClient client = new AdapterClient();

        client.plug(new EuPlug());
        client.plug(new UsSocketAdapter(new UsSocket()));
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