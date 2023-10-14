public class Bread {
    public int id;
    private int weight;
    private int price;
    private int review;
    private String producer;
    public boolean hasMeat;
    public int produceDate;

    public int BestBy;

    private int count = 0;

    public Bread(int weight, int price, int review, String producer, boolean hasMeat, int produceDate, int bestBy) {

        id = count++;
        this.weight = weight;
        this.price = price;
        this.review = review;
        this.producer = producer;
        this.hasMeat = hasMeat;
        this.produceDate = produceDate;
        BestBy = bestBy;
        System.out.println("Created Bread instance with id:" + id);
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

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public static void main(String[] args) {
        Bread bread1 = new Bread(350, 3, 4, "BakeryX", false, 20230920, 20230930);
        Bread bread2 = new Bread(400, 2, 3, "BakeryY", true, 20230915, 20230928);
        Bread bread3 = new Bread(300, 4, 5, "BakeryZ", false, 20230918, 20230925);
    }

}
