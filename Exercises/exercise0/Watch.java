public class Watch {
    public int id;
    private int weight;
    private int price;
    private String color;
    private String brand;
    public String Material;
    public boolean hasGold;
    public boolean hasSilver;
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

    public Watch(int weight, int price, String color, String brand, String material, boolean hasGold, boolean hasSilver) {
        id = count++;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.brand = brand;
        Material = material;
        this.hasGold = hasGold;
        this.hasSilver = hasSilver;
        System.out.println("Created Watch instance with id:" + id);
    }
    public static void main(String[] args) {
        Watch watch1 = new Watch(100, 200, "Silver", "Rolex", "Stainless Steel", true, false);
        Watch watch2 = new Watch(120, 250, "Gold", "TAG Heuer", "Gold Plated", false, true);
        Watch watch3 = new Watch(90, 150, "Black", "Casio", "Plastic", false, false);
    }


}
