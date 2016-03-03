import java.util.ArrayList;

public class RustyMace extends Weapon implements BluntWeapon{

    int weaponDamage = 10;
    
    public RustyMace(){
        super.itemName = "Rusty Mace";
    }

    public void bash() {

    }

    public void cleave() {

    }

    public void block() {

    }

    public int attack() {
        return weaponDamage;
    }
}
