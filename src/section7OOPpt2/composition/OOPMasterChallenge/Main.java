package section7OOPpt2.composition.OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic", "White", "Beef", 3.00);
        double price = hamburger.itemizeHamburger();
        hamburger.addletuce("lettuce", 0.50);
        hamburger.addcheese("Cheese",0.90);
        hamburger.addtomato("Tomato",0.80);
        hamburger.addketchup("Ketchup", 0.15);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Chicken",4.00 );
        healthyBurger.setHealthAddition1("Chillis",1.00);
        healthyBurger.setHealthAddition2("Red Onions",1.35);
        System.out.println("Total Healthy Burger Price is " + healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addcheese("Cheese", 0.90);
        System.out.println("Total Deluxe Hamburger Price is " + deluxeHamburger.itemizeHamburger());
    }
}