
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Weapon extends Item implements WeaponInterface{
    public int weaponDamage;
    public int weaponSpeed;
    
    public void attack(int target) {
       
    }
    
    public boolean parry() {
        return true;
    }
}
