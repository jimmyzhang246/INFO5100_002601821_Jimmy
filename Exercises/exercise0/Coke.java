public class Coke {
    public int id;
    private int weight;
    private int price;
    private String color;
    private String brand;
    public String sugarType;
    public int produceDate;
    public int BestBy;
    private int count = 0;

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

    public Coke(int weight, int price, String color, String brand, String sugarType, int produceDate, int bestBy) {
        id = count++;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.sugarType = sugarType;
        this.produceDate = produceDate;
        BestBy = bestBy;
        System.out.println("Created Coke instance with id:" + id);
    }
    public static void main(String[] args) {
        Coke coke1 = new Coke(355, 2, "Brown", "Coca-Cola", "Regular", 20231001, 20241001);
        Coke coke2 = new Coke(500, 2, "Red", "Pepsi", "Diet", 20230115, 20240115);
        Coke coke3 = new Coke(250, 1, "Silver", "Sprite", "Zero", 20230720, 20240720);
    }

}
