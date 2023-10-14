public class Phone {
    public int id;
    private int weight;
    private String color;
    private String brand;
    public String screenType;
    public int simCapacity;
    public int batteryLife;
    public boolean hasNFC;
    private int count = 0;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Phone(int weight, String color, String brand, String screenType, int simCapacity, int batteryLife, boolean hasNFC) {
        id = count++;
        this.weight = weight;
        this.color = color;
        this.brand = brand;
        this.screenType = screenType;
        this.simCapacity = simCapacity;
        this.batteryLife = batteryLife;
        this.hasNFC = hasNFC;
        System.out.println("Created Phone instance with id:" + id);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(150, "Black", "Samsung", "AMOLED", 2, 24, true);
        Phone phone2 = new Phone(180, "Silver", "Apple", "OLED", 1, 20, false);
        Phone phone3 = new Phone(160, "Blue", "Google", "LCD", 2, 18, true);
    }

}
