
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Character {
    int hp;
    public void drainHealth(int x) {
        hp -= x;
    }
    
}
