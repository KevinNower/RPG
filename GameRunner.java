
/**
 * Write a description of class GameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public abstract class GameRunner {

    public static void main() {
        Scanner userInput = new Scanner(System.in);

        RustyMace rustyMace = new RustyMace();
        RustyDagger rustyDagger = new RustyDagger();
        TwigWand twigWand = new TwigWand();
        RustyWrench rustyWrench = new RustyWrench();
        WoodenBow woodenBow = new WoodenBow();
        RustySpear rustySpear = new RustySpear();
        RustyShortSword rustyShortSword = new RustyShortSword();
        RustyLongSword rustyLongSword = new RustyLongSword();

        IronMace ironMace = new IronMace();
        IronDagger ironDagger = new IronDagger();
        WoodenStaff woodenStaff = new WoodenStaff();
        IronWrench ironWrench = new IronWrench();
        ShortBow shortBow = new ShortBow();
        IronSpear ironSpear = new IronSpear();
        IronShortSword ironShortSword = new IronShortSword();
        IronLongSword ironLongSword = new IronLongSword();

        SteelMace steelMace = new SteelMace();
        SteelDagger steelDagger = new SteelDagger();
        ElementalStaff elementalStaff = new ElementalStaff();
        SteelWrench steelWrench = new SteelWrench();
        CompoundBow compoundBow = new CompoundBow();
        SteelSpear steelSpear = new SteelSpear();
        SteelShortSword steelShortSword = new SteelShortSword();
        SteelLongSword steelLongSword = new SteelLongSword();

        CementAndRebar cementAndRebar = new CementAndRebar();
        PoisonedDagger poisonedDagger = new PoisonedDagger();
        GodsStaff godsStaff = new GodsStaff();
        RobotArm robotArm = new RobotArm();
        TriShotBow triShotBow = new TriShotBow();
        RomanSpear RomanSpear = new RomanSpear();
        SwordGauntlets swordGauntlets = new SwordGauntlets();
        BroadSword broadSword = new BroadSword();

        Wolf wolf = new Wolf();
        Assassin assassin = new Assassin();
        Bandit bandit = new Bandit();
        VampireFledgling vampireFledgling = new VampireFledgling();
        VampireLord vampireLord = new VampireLord();
        Necromancer necromancer = new Necromancer();

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

        int choice = userInput.nextInt();

        if(choice == 1) {
            System.out.println("Congrats, you are a Berzerker.");
        }
        else if(choice == 2) {
            System.out.println("Congrats, you are an Assassin.");
        }
        else if(choice == 3) {
            System.out.println("Congrats, you are a Mage.");
        }
        else if(choice == 4) {
            System.out.println("Congrats, you are an Engineer.");
        }
        else if(choice == 5) {
            System.out.println("Congrats, you are a Ranger.");
        }
        else if(choice == 6) {
            System.out.println("Congrats, you are a Lancer.");
        }
        else if(choice == 7) {
            System.out.println("Congrats, you are a Swordsman.");
        }
        else if(choice == 8) {
            System.out.println("Congrats, you are a Knight.");
        }
        else {
            System.out.println("I mean, you can try and cheat the system, but it won't do you much good. Just sayin.");
            System.out.println("Please actually choose next time.");
            System.exit(0);
        }

    }
}

