
/**
 * Write a description of class GameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public abstract class GameRunner {

    public void main() {
        Scanner userInput = new Scanner(System.in);
        
        RustyMace rustyMace = new RustyMace();
        RustyDagger rustyDagger = new RustyDagger();
        TwigWand twigWand = new TwigWand();
        RustyWrench rustyWrench = new RustyWrench();
        WoodenBow woodenBow = new WoodenBow();
        RustySpear rustySpear = new RustySpear();
        RustyShortSword rustyShortSword = new RustyShortSword();
        RustyLongSword rustyLongSword = new RustyLongSword();
       
        System.out.println("You wake up in a dark room, surrounded by");
        System.out.println("a bunch of old weapons. Which one would you like");
        System.out.println("to choose?");
        System.out.println();

        System.out.println("1." + " " + rustyMace.getName());
        System.out.println("2." + " " + rustyDagger.getName());
        System.out.println("3." + " " + twigWand.getName());
        System.out.println("4." + " " + rustyWrench.getName());
        System.out.println("5." + " " + woodenBow.getName());
        System.out.println("6." + " " + rustySpear.getName());
        System.out.println("7." + " " + rustyShortSword.getName());
        System.out.println("8." + " " + rustyLongSword.getName());
        System.out.println();

        if(userInput.hasNextInt()) {
            int choice = userInput.nextInt();
            System.out.println();

            if(choice == 1) {
                System.out.println("Congrats, you are a Berzerker.");
                Backpack.storeItem(rustyMace);
            }
            else if(choice == 2) {
                System.out.println("Congrats, you are an Assassin.");
                Backpack.storeItem(rustyDagger);
            }
            else if(choice == 3) {
                System.out.println("Congrats, you are a Mage.");
                Backpack.storeItem(twigWand);
            }
            else if(choice == 4) {
                System.out.println("Congrats, you are an Engineer.");
                Backpack.storeItem(rustyWrench);
            }
            else if(choice == 5) {
                System.out.println("Congrats, you are a Ranger.");
                Backpack.storeItem(woodenBow);
            }
            else if(choice == 6) {
                System.out.println("Congrats, you are a Lancer.");
                Backpack.storeItem(rustySpear);
            }
            else if(choice == 7) {
                System.out.println("Congrats, you are a Swordsman.");
                Backpack.storeItem(rustyShortSword);
            }
            else if(choice == 8) {
                System.out.println("Congrats, you are a Knight.");
                Backpack.storeItem(rustyLongSword);
            }
            else {
                System.out.println("I mean, you can try and cheat the system, but it won't do you much good. Just sayin.");
                System.out.println("Please actually choose next time.");
                System.exit(0);
            }
            
            System.out.println("You store your weapon in an old beat up sack you find in the room");
            
        }
        
        else {
            System.out.println();
            System.out.println("Please enter an integer next time.");
            System.exit(0);
        }
        
        

    }
}

