package section7OOPpt2.composition.OOPMasterChallenge;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double basePrice;


    private String lettuce;
    private double lettucePrice;

    private String tomato;
    private double tomatoPrice;

    private String cheese;
    private double cheesePrice;

    private String ketchup;
    private double ketchupPrice;

    public Hamburger(String name, String breadRoll, String meat, double basePrice) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
    }


    public void addletuce(String lettuce, double price){
        this.lettuce = lettuce;
        this.lettucePrice = price;
    }

    public void addtomato(String tomato, double price){
        this.tomato = tomato;
        this.tomatoPrice = price;

    }
    public void addcheese(String cheese, double price){
        this.cheese = cheese;
        this.cheesePrice = price;

    }
    public void addketchup(String ketchup, double price){
        this.ketchup = ketchup;
        this.ketchupPrice = price;

    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name + " hamburger "+ " on a " + this.breadRoll + " roll " + "price is " + this.basePrice);
        if(this.lettuce != null){
            hamburgerPrice += this.lettucePrice;
            System.out.println("Added " + this.lettuce + " for an extra " + this.lettucePrice);
        }
        if(this.tomato != null){
            hamburgerPrice += this.tomatoPrice;
            System.out.println("Added " + this.tomato + " for an extra " + this.tomatoPrice);
        }
        if(this.cheese != null){
            hamburgerPrice += this.cheesePrice;
            System.out.println("Added " + this.cheese + " for an extra " + this.cheesePrice);
        }
        if(this.ketchup != null){
            hamburgerPrice += this.ketchupPrice;
            System.out.println("Added " + this.ketchup + " for an extra " + this.ketchupPrice);
        }
        return hamburgerPrice;
    }
}
