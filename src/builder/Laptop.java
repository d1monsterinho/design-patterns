package builder;

public class Laptop extends Computer {
    private String color;
    private int screenResolution;

    public Laptop() {
    }

    public Laptop(String CPU, String GPU, int RAMCapacity, String diskType, int diskCapacity, int powerModuleCapacity, String color, int screenResolution) {
        super(CPU, GPU, RAMCapacity, diskType, diskCapacity, powerModuleCapacity);
        this.color = color;
        this.screenResolution = screenResolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
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
                ", color=" + getColor() +
                ", screenResolution=" + getScreenResolution() +
                '}';
    }
}
