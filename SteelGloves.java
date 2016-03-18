
/**
 * Write a description of class SteelGloves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SteelGloves extends HeavyArmor
{
    public SteelGloves() {
        super.itemName = "Steel Gloves";
    }
    
    public boolean blocked() {
        return false;
    }
}
