public class Main {
    public static void main(String[] args) {
        Meal meal=new Meal();
        // Print the details of the default meal
        meal.addBurgerTopping(new Topping("Lettuce",0.75f));
        meal.addBurgerTopping(new Topping("Cheese",0.50f));
        meal.changeDrinkSize("Medium",0.5f);
        meal.printItemizedList();
        meal.totalBill();

        DeluxBurger deluxBurger=new DeluxBurger("Double Mac");
        deluxBurger.addToppings(new Topping("Bacon",1.0f));
        deluxBurger.addToppings(new Topping("Onion",0.5f));
        deluxBurger.addToppings(new Topping("Onion",0.5f));
        Drink drink1 = new Drink("Sprite", "Large", 2.00f); // Create a large drink
        SideItem side1 = new SideItem("Onion Rings", 2.75f); // Create a different side item
        Meal meal1=new Meal(deluxBurger,drink1,side1);
        meal1.printItemizedList();
        meal1.totalBill(); // Print the details and total bill for the second meal
    }
}