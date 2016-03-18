
/**
 * Write a description of class SteelBoots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SteelBoots extends HeavyArmor
{
    public SteelBoots() {
        super.itemName = "Steel Boots";
    }
    
    public boolean blocked() {
        return false;
    }
}
