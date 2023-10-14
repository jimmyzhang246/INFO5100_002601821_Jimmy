public class Bottle {
    public int id;
    private int weight;
    private int price;
    private String color;
    private String brand;
    public String shape;
    public int maxLoad;

    public boolean hasFilter;
    private int count = 0;

    public Bottle(int weight, int price, String color, String brand, String shape, int maxLoad, boolean hasFilter) {
        id = count++;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.shape = shape;
        this.maxLoad = maxLoad;
        this.hasFilter = hasFilter;
        System.out.println("Created Bottle instance with id:" + id);
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
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(200, 5, "Blue", "AquaFresh", "Cylinder", 500, true);
        Bottle bottle2 = new Bottle(150, 4, "Red", "HydrateMe", "Square", 400, false);
        Bottle bottle3 = new Bottle(180, 6, "Green", "PureH2O", "Round", 550, true);

    }

}
