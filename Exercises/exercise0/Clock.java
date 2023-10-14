public class Clock {
    public int id;
    private int weight;
    private int price;
    private String color;
    private String brand;
    public String shape;
    public boolean isDigit;
    public boolean hasAlarm;
    private int count = 0;

    public Clock(int weight, int price, String color, String brand, String shape, boolean isDigit, boolean hasAlarm) {
        id = count++;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.shape = shape;
        this.isDigit = isDigit;
        this.hasAlarm = hasAlarm;
        System.out.println("Created Clock instance with id:" + id);
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
        Clock clock1 = new Clock(500, 50, "Black", "Sony", "Round", true, true);
        Clock clock2 = new Clock(300, 30, "White", "Casio", "Square", true, false);
        Clock clock3 = new Clock(400, 40, "Silver", "Seiko", "Oval", false, true);
    }

}
