package section7OOPpt2.composition.OOPMasterChallenge;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "White", "Beef & Bacon", 8.59);
        super.addcheese("Cheesy Chips",2.19);
        super.addletuce("Strawberry Milkshake",3.99);
    }

    @Override
    public void addletuce(String lettuce, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addtomato(String tomato, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addcheese(String cheese, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }

    @Override
    public void addketchup(String ketchup, double price) {
        System.out.println("Can't add additional items to a deluxe burger");
    }
}
