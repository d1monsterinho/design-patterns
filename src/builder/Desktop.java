package builder;

public class Desktop extends Computer {
    private String desktopCase;

    public Desktop() {
    }

    public Desktop(String CPU, String GPU, int RAMCapacity, String diskType, int diskCapacity, int powerModuleCapacity, String desktopCase) {
        super(CPU, GPU, RAMCapacity, diskType, diskCapacity, powerModuleCapacity);
        this.desktopCase = desktopCase;
    }

    public String getDesktopCase() {
        return desktopCase;
    }

    public void setDesktopCase(String desktopCase) {
        this.desktopCase = desktopCase;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + getCPU() + '\'' +
                ", GPU='" + getGPU() + '\'' +
                ", RAMCapacity=" + getRAMCapacity() +
                ", diskType='" + getDiskType() + '\'' +
                ", diskCapacity=" + getDiskCapacity() +
                ", powerModuleCapacity=" + getPowerModuleCapacity() +
                ", desktopCase=" + getDesktopCase() +
                '}';
    }
}
