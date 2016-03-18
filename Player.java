
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Character{
    public Player (String firstName_,String lastName_, String middleInitial_, int intelligence_, int charisma_,
    int strength_, int dexterity_, String race_, int age_, PlayerClass playerClass_) {
        String firstName = firstName_;
        String lastName = lastName_;
        String middleInitial = middleInitial_;
        String race = race_;
        int intelligence = intelligence_;
        int charisma = charisma_;
        int strength = strength_;
        int dexterity = dexterity_;
        int age = age_;
        PlayerClass playerClass = playerClass_;
    }
}