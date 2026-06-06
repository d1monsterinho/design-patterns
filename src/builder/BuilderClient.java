package builder;

public class BuilderClient {

    public void createRegularGamingDesktopAndPrint() {
        DesktopBuilder builder = new DesktopBuilder();
        ComputerDirector director = new ComputerDirector();

        director.createRegularGamingComputer(builder);
        builder.setDesktopCase("ARTLINE 1100XT");

        Desktop regularGamingDesktop = builder.getProduct();
        System.out.println(regularGamingDesktop);
    }
}
