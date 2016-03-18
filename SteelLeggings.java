
/**
 * Write a description of class SteelLeggings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SteelLeggings extends HeavyArmor
{
    public SteelLeggings() {
        super.itemName = "Steel Leggings";
    }
    
    public boolean blocked() {
        return false;
    }
}
