import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

public class Bee extends Actor
{
    private List<Ball> ballList;
    
    public Bee()
    {
        ballList = new ArrayList<Ball>();
    }
    public void act() 
    {
        ballList = getWorld().getObjects(Ball.class);
        System.out.print(ballList.get(2).getX());
        booelan.canRemove = true;
        if(Greenfoot.isKeyDown("x") && canRemove)
        {
            if(ballList.size()>0)
            {
                int rand = (int)(Math.random() * ballList.size());
                getWorld().removeObject(ballList.get(rand));
            }
        }
    }    
}
