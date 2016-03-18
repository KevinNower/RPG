
/**
 * Write a description of class LeatherGloves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeatherGloves extends LightArmor
{
    public LeatherGloves() {
        super.itemName = "Leather Gloves";
    }
    
    public boolean blocked() {
        return false;
    }
}
