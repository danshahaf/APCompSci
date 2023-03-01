import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/* goals:
 
//reflection of disk from Striker

AI behavior
sliding of disk
records and highScores(use arrayList)
 */
public class Striker2 extends Actor
{
    private int x;
    private int y;
    private int counter;
    private List<Disk> disks;
    private int level;
    private boolean tablesPermission;
    public Striker2()
    {
        this.x = x;
        this.y = y;
        disks = new ArrayList<Disk>();
    }
    public void act() 
    {
        disks = getWorld().getObjects(Disk.class);
            if(disks.get(0).getY() < 390)
            {
                turnTowards(disks.get(0).getX(),disks.get(0).getY());
                move(disks.get(0).getLevel());
            }
            else if( this.getX() != 250 && this.getY() != 82)
            {
            
                turnTowards(250, 82);
                if(disks.get(0).getLevel() > 3)
                {
                    move(2);
                }
                else
                {
                    move(1);
                }
                
            }
    }    
}