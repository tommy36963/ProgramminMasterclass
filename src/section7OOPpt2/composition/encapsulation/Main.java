package section7OOPpt2.composition.encapsulation;

public class Main {
    public static void main(String[] args) {

        // Not the proper way below to do encapsulation

     /*   Player player = new Player();
        player.fullName = "Tommy Higgaz";
        player.health = 100;
        player.weapon = "Zombie Knife";

        int damage = 10;
        player.loseHeatlh(damage);
        System.out.println("Health Remaining = " + player.healthRemaining());

         damage = 90;
        player.loseHeatlh(damage);
        System.out.println("Health Remaining = " + player.healthRemaining()); */

     EnhancedPlayer player = new EnhancedPlayer("Tommy", 200, "Mac 10");
        System.out.println("Initial Heath is " + player.getHealth());
    }
}
