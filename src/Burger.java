import java.util.Arrays;

public class Burger {

    private String type;
    private float price;
    private Topping[] toppings; // Array to hold up to 3 toppings

    public Burger(String type, float price) {
        this.type = type;
        this.price = price;
        this.toppings=new Topping[3]; // Initialize the array to hold 3 toppings
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

    public boolean addToppings(Topping topping){
        for (int i=0;i< toppings.length;i++){
            if (toppings[i]==null){
                toppings[i]=topping;
                return true;
            }
        }
        return false;
    }
    public float calculate_price(){
        float total_price=price;
        for (int i=0;i< toppings.length;i++){
            if (toppings[i]!=null){
                float toppingPrice=toppings[i].getPrice();
                total_price +=toppingPrice;
            }
        }
        return total_price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", toppings=" + Arrays.toString(toppings) +
                '}';
    }
}

class DeluxBurger extends Burger{
    private int toppingsAdded = 0; // Track the number of toppings added to this DeluxeBurger

    // static means it belongs to class but not to instance
    // final indicates when it assigns once it can't change
    private static final float DELUX_PRICE=10.0f;// Fixed price for DeluxeBurger

    public DeluxBurger(String type) {
        super(type, DELUX_PRICE);
    }

    // Override the method to add toppings, with a limit of two additional toppings
    @Override
    public boolean addToppings(Topping topping) {
        if (toppingsAdded < 2) { // Check if less than two toppings have been added
            boolean added = super.addToppings(topping); // Attempt to add the topping
            if (added) {
                toppingsAdded++; // Increment the counter if topping was successfully added
                return true;
            }
        } else {
            System.out.println("Cannot add more than 2 additional toppings to a DeluxeBurger.");
        }
        return false;
    }

    @Override
    public float calculate_price() {
        return DELUX_PRICE; //return fixed price of delux burger regarless of add toppings
    }
}
