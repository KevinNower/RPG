
/**
 * Write a description of class GameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public abstract class GameRunner {
    /* public void createRooms() {
    Room doghouse = new Room;
    }

     */

    public static void main() {
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
        
        
    }
}
