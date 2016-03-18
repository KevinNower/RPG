
/**
 * Write a description of class SteelHelmet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SteelHelmet extends HeavyArmor
{
    public SteelHelmet() {
        super.itemName = "Steel Helmet";
    }
    
    public boolean blocked() {
        return false;
    }
}
