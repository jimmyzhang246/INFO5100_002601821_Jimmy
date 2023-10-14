public class Car {
    public int id;
    private int weight;
    private int capacity;
    private String color;
    public String brand;
    public int engineNumber;
    public int maxSpeed;
    public boolean hasAbs;
    public boolean hasCarPlay;
    private int count = 0;


    public Car(int weight, int capacity, String color, String brand, int engineNumber, int maxSpeed, boolean hasAbs, boolean hasCarPlay) {
        id = count++;
        this.weight = weight;
        this.capacity = capacity;
        this.color = color;
        this.brand = brand;
        this.engineNumber = engineNumber;
        this.maxSpeed = maxSpeed;
        this.hasAbs = hasAbs;
        this.hasCarPlay = hasCarPlay;
        System.out.println("Created Car instance with id:" + id);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car(1500, 5, "Red", "Toyota", 123456, 200, true, true);
        Car car2 = new Car(1800, 7, "Blue", "Honda", 789012, 180, false, true);
        Car car3 = new Car(1400, 5, "Silver", "Ford", 654321, 220, true, false);
    }

}
