package builder;

public class ComputerDirector {

    public void createRegularGamingComputer(ComputerBuilder builder) {
        builder.setCPU("AMD Ryzen 5 3600");
        builder.setGPU("RTX 3060");
        builder.setRAMCapacity(16);
        builder.setDiskType("SSD");
        builder.setDiskCapacity(1024);
        builder.setPowerModuleCapacity(700);
    }

    public void createPowerfulGamingComputer(ComputerBuilder builder) {
        builder.setCPU("AMD Ryzen 7 9800X3D");
        builder.setGPU("RTX 5070");
        builder.setRAMCapacity(32);
        builder.setDiskType("SSD");
        builder.setDiskCapacity(2048);
        builder.setPowerModuleCapacity(850);
    }

    public void createFlagmanGaminComputer(ComputerBuilder builder) {
        builder.setCPU("AMD Ryzen 9 9900");
        builder.setGPU("RTX 5080TI");
        builder.setRAMCapacity(64);
        builder.setDiskType("SSD");
        builder.setDiskCapacity(4096);
        builder.setPowerModuleCapacity(1100);
    }

    public void createShittyComputer(ComputerBuilder builder) {
        builder.setCPU("Intel Celeron");
        builder.setRAMCapacity(8);
        builder.setDiskType("HDD");
        builder.setDiskCapacity(512);
        builder.setPowerModuleCapacity(300);
    }
}
