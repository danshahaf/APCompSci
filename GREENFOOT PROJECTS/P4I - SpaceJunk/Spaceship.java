import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class Spaceship extends Actor
{
    private List<Spacejunk> spaceJunkObjects;
    private int speed;
    private int size;
    private int counter;
    public Spaceship(int speed)
    {
        this.speed = speed;
        
    }
    public void act() 
    {
        getWorld().showText("Coordinates: \n" + getX() + ", " + getY(), 525,350);
        move(speed);


         if(isAtEdge())
         {
             turn((int)(90 * Math.random() + 90));
         }

         getWorld().showText("Removed \nJunks: \n" + Integer.toString(removeSpaceJunk(10000)), 50 , 50);
        
    }    
    public int removeSpaceJunk( int minAltitude )
    {
        
        spaceJunkObjects = getWorld().getObjects(Spacejunk.class);
        for(int i = 0 ; i < spaceJunkObjects.size(); i++)
        {
            if(spaceJunkObjects.get(i).getAltitude() < minAltitude)
            {
                getWorld().removeObject(spaceJunkObjects.get(i));
                counter ++;
            }
        }
        
        return counter;
    }
    
}
