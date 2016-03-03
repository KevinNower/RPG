
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Weapon extends Item implements WeaponInterface{
    public int weaponDamage;
    public int weaponSpeed;
    Enemy target;

    public int attack(int targetChoice) {
        target.drainHealth(weaponDamage);
        return target.hp;
    }

    public boolean parry() {
        return true;
    }
}
