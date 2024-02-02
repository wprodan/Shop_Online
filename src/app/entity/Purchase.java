package app.entity;

public class Purchase {

    private final int quota;
    private final double price;

    public Purchase (int quota, double price){
        this.quota = quota;
        this.price = price;
    }

    public String getQUota() {
        return quota;
    }
    public String getPrice() {
        return price;
    }
}
