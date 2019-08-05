package section7OOPpt2.composition.encapsulation;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHeatlh(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player BODIED!!");
            // Reduce number of lives reamaining for player
        }
    }
    public int healthRemaining(){
        return this.health;
    }
}
