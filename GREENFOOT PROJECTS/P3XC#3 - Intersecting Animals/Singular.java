import greenfoot.*;  

public class Singular extends Actor
{
    private int speed;
    public Singular()
    {
        speed = 0;
    }
    public Singular(int speed)
    {
        this.speed = speed;
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
                
                setRotation(0);
                move(speed);
                
            }       
        else if(Greenfoot.isKeyDown("left")){
                
                setRotation(180);
                move(speed);
                      
            }
        else if(Greenfoot.isKeyDown("up")){
                
                setRotation(270);
                move(speed);
                
            }
        else if(Greenfoot.isKeyDown("down")){
                
                setRotation(90);
                move(speed);
                
            }
        
        if(isTouching(Plural.class))
        {
            //removeTouching(Plural.class);
            getWorld().removeObjects(getWorld().getObjects(Plural.class));
        }
    }    
}
