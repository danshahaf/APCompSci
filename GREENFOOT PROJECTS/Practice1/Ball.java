import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int distance;
    
    
    public Ball()
    {
        distance = (int)(Math.random()*7 +1);
    }
    
    public void act() 
    {
        // Add your action code here.
        
        move(distance);
        if(isAtEdge())
        {
            distance*= -1;
        }
    }    
}
