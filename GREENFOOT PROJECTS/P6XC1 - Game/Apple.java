import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Star.class))
            {
                //getWorld().removeObject(this);
                this.setLocation((int)(Math.random() * getWorld().getWidth()), 50);
                //getWorld().showText("Score", getWorld().getWidth(), getWorld().getHeight());
            }
        turnTowards(this.getX(), getWorld().getHeight());
        move((int)(Math.random()*4+1));
        if(isAtEdge()){
            this.setLocation((int)(Math.random() * getWorld().getWidth()), 50);
        }
    }    
}
