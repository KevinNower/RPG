
/**
 * Write a description of class ChainmailHelmet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChainmailHelmet extends MediumArmor
{
    public ChainmailHelmet() {
        super.itemName = "Chainmail Helmet";
    }
    
    public boolean blocked() {
        return false;
    }
}