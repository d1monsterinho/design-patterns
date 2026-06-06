package builder;

public class LaptopBuilder implements ComputerBuilder {
    private Laptop laptop;

    @Override
    public void reset() {
        laptop = new Laptop();
    }

    @Override
    public void setCPU(String CPU) {
        laptop.setCPU(CPU);
    }

    @Override
    public void setGPU(String GPU) {
        laptop.setGPU(GPU);
    }

    @Override
    public void setRAMCapacity(int ramCapacity) {
        laptop.setRAMCapacity(ramCapacity);
    }

    @Override
    public void setDiskType(String diskType) {
        laptop.setDiskType(diskType);
    }

    @Override
    public void setDiskCapacity(int diskCapacity) {
        laptop.setDiskCapacity(diskCapacity);
    }

    @Override
    public void setPowerModuleCapacity(int powerModuleCapacity) {
        laptop.setPowerModuleCapacity(powerModuleCapacity);
    }

    public void setColor(String color) {
        laptop.setColor(color);
    }

    public void setScreenResolution(int resolution) {
        laptop.setScreenResolution(resolution);
    }

    @Override
    public Laptop getProduct() {
        Laptop laptopProduct = laptop;
        reset();
        return laptopProduct;
    }
}
