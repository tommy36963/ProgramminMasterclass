package section7OOPpt2.composition.OOPMasterChallenge;

public class HealthyBurger extends Hamburger {

    private String healthAdditionName;
    private double healthAdditionPrice;

    private String healthAdditionName2;
    private double healthAdditionPrice2;

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy", "Brown Rye", meat, basePrice);
    }

    public void setHealthAddition1(String name, double basePrice){
        this.healthAdditionName = name;
        this.healthAdditionPrice = basePrice;
    }

    public void setHealthAddition2(String name, double basePrice){
        this.healthAdditionName2 = name;
        this.healthAdditionPrice2 = basePrice;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthAdditionName != null){
            hamburgerPrice += healthAdditionPrice;
            System.out.println("Added " + this.healthAdditionName + " for an extra " + this.healthAdditionPrice);
        }
        if(this.healthAdditionName2 != null){
            hamburgerPrice += healthAdditionPrice2;
            System.out.println("Added " + this.healthAdditionName2 + " for an extra " + this.healthAdditionPrice2);
        }
        return hamburgerPrice;
    }
}
