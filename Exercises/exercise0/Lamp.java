public class Lamp {
    public int id;
    private int weight;
    private int price;
    private String color;
    private String brand;
    public String shape;
    public int lumen;
    public boolean dimmable;
    private int count = 0;

    public Lamp(int weight, int price, String color, String brand, String shape, int lumen, boolean dimmable) {
        id = count++;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.shape = shape;
        this.lumen = lumen;
        this.dimmable = dimmable;
        System.out.println("Created Lamp instance with id:" + id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(5, 40, "White", "Philips", "Cylinder", 800, true);
        Lamp lamp2 = new Lamp(7, 30, "Black", "IKEA", "Square", 600, false);
        Lamp lamp3 = new Lamp(6, 50, "Silver", "Osram", "Round", 1000, true);
    }


}
