import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed = 5;
    
    public Baby(){
        int randomValue = Greenfoot.getRandomNumber(2);
        
        if (randomValue == 0)
        {
            System.out.println("Baby was created!");
        }
        if (randomValue == 1)
        {
            System.out.println("Baby was born");
        }
    }
    
    public void act() 
    {
        move(speed);
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(180));
            getWorld().addObject(new Baby(), 100, 100);
        }
            
            
    }    
}
