public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem side;


    public Meal() {
        this.burger = new Burger("Ham Burger", 4.50f);
        this.drink = new Drink("Coke", "Small", 3.75f);
        this.side = new SideItem("Small Chops", 3.50f);
    }

    public Meal(Burger burger, Drink drink, SideItem side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }
    public void addBurgerTopping(Topping topping) {
        if (!burger.addToppings(topping)) {
            System.out.println("Cannot add more toppings to the burger.");
        }
    }

    public void changeDrinkSize(String newSize,float newPrice){
        drink.changeSize(newSize,newPrice);
    }

    public void printItemizedList() {
        System.out.println("Meal Itemized List:");
        System.out.println("Burger: " + burger.getType() + " - $" + burger.calculate_price());
        System.out.println("Drink: " + drink.getType() + " (" + drink.getSize() + ") - $" + drink.getPrice());
        System.out.println("Side: " + side.getType() + " - $" + side.getPrice());
    }
    public void totalBill(){
        float total= burger.calculate_price()+ drink.getPrice()+ side.getPrice();
        System.out.println("Total Bill: $" + total);
    }
    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", side=" + side +
                '}';
    }
}
