public class Topping {
    private String type;
    private float price;

    public Topping(String type, float price) {
        this.type = type;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
