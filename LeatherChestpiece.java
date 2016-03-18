
/**
 * Write a description of class LeatherChestpiece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeatherChestpiece extends LightArmor
{
    public LeatherChestpiece() {
        super.itemName = "Leather Chestpiece";
    }
    
    public boolean blocked() {
        return false;
    }
}
