
/**
 * Write a description of class SteelChestpiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SteelChestpiece extends HeavyArmor
{
    public SteelChestpiece() {
        super.itemName = "Steel Chestpiece";
    }
    
    public boolean blocked() {
        return false;
    }
}
