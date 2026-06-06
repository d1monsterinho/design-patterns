package builder;

public abstract class Computer {
    private String CPU;
    private String GPU;
    private int RAMCapacity;
    private String diskType;
    private int diskCapacity;
    private int powerModuleCapacity;

    public Computer() {
    }

    public Computer(String CPU, String GPU, int RAMCapacity, String diskType, int diskCapacity, int powerModuleCapacity) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAMCapacity = RAMCapacity;
        this.diskType = diskType;
        this.diskCapacity = diskCapacity;
        this.powerModuleCapacity = powerModuleCapacity;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getRAMCapacity() {
        return RAMCapacity;
    }

    public void setRAMCapacity(int RAMCapacity) {
        this.RAMCapacity = RAMCapacity;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public int getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(int diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public int getPowerModuleCapacity() {
        return powerModuleCapacity;
    }

    public void setPowerModuleCapacity(int powerModuleCapacity) {
        this.powerModuleCapacity = powerModuleCapacity;
    }
}
