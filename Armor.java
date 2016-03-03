
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */

import java.lang.Math;
public abstract class Armor extends Item implements DefenseCommands
{

    double chance = Math.random()*10;
    int boundary;

    boolean block() {
        if(chance > boundary) {
            System.out.println("Your armor blocked the attack. You got lucky.");
            return true;
        }

        else {
            return false;
        }
    }
}
