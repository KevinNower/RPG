
/**
 * Write a description of class LeatherHelmet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeatherHelmet extends LightArmor{
    public LeatherHelmet() {
        super.itemName = "Leather Helmet";
    }
    
    public boolean blocked() {
        return false;
    }
}
