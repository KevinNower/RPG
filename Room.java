import java.util.ArrayList;
/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room
{
    int enemyNumber;
    ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
    
    public Room(String name_) {
        
        String roomName = name_;
        
        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();
        Wolf wolf3 = new Wolf();

        enemyList.add(wolf1);
        enemyList.add(wolf2);
        enemyList.add(wolf3);
    }

    public void listEnemies() {
        for(Enemy x : enemyList) {
            enemyNumber ++;
            System.out.println(enemyNumber + "." + " " + "Wolf");
        }
    }

    //look up getAttribute
}
