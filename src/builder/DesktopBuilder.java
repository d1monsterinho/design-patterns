package builder;

public class DesktopBuilder implements ComputerBuilder {
    private Desktop desktop;

    public DesktopBuilder() {
        reset();
    }

    @Override
    public void reset() {
        desktop = new Desktop();
    }

    @Override
    public void setCPU(String CPU) {
        desktop.setCPU(CPU);
    }

    @Override
    public void setGPU(String GPU) {
        desktop.setGPU(GPU);
    }

    @Override
    public void setRAMCapacity(int ramCapacity) {
        desktop.setRAMCapacity(ramCapacity);
    }

    @Override
    public void setDiskType(String diskType) {
        desktop.setDiskType(diskType);
    }

    @Override
    public void setDiskCapacity(int diskCapacity) {
        desktop.setDiskCapacity(diskCapacity);
    }

    @Override
    public void setPowerModuleCapacity(int powerModuleCapacity) {
        desktop.setPowerModuleCapacity(powerModuleCapacity);
    }

    public void setDesktopCase(String desktopCase) {
        desktop.setDesktopCase(desktopCase);
    }

    @Override
    public Desktop getProduct() {
        Desktop desktopProduct = desktop;
        reset();
        return desktopProduct;
    }
}
