package builder;

public interface ComputerBuilder {
    void reset();
    void setCPU(String CPU);
    void setGPU(String GPU);
    void setRAMCapacity(int ramCapacity);
    void setDiskType(String diskType);
    void setDiskCapacity(int diskCapacity);
    void setPowerModuleCapacity(int powerModuleCapacity);

    Computer getProduct();
}
