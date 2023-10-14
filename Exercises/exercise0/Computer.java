public class Computer {
    public int id;
    private int weight;
    private String cpuType;
    private String color;
    public String brand;
    public String screenType;
    public int cpuNumber;
    public boolean hasTouchScreen;
    public boolean hasHDMI;
    private int count = 0;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Computer(int weight, String cpuType, String color, String brand, String screenType, int cpuNumber, boolean hasTouchScreen, boolean hasHDMI) {
        id = count++;
        this.weight = weight;
        this.cpuType = cpuType;
        this.color = color;
        this.brand = brand;
        this.screenType = screenType;
        this.cpuNumber = cpuNumber;
        this.hasTouchScreen = hasTouchScreen;
        this.hasHDMI = hasHDMI;
        System.out.println("Created Computer instance with id:" + id);
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(1500, "Intel Core i7", "Silver", "Dell", "LED", 4, true, true);
        Computer computer2 = new Computer(1200, "AMD Ryzen 9", "Black", "HP", "OLED", 8, true, false);
        Computer computer3 = new Computer(1800, "Intel Core i5", "Space Gray", "Apple", "Retina", 4, false, true);
    }

}
