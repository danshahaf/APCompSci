import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ladybug extends Actor
{
    
    public void act() 
    {
        if(isTouching(Star.class))
            {
                //getWorld().addObject(new Flash(), this.getX(), this.getY());
                //getWorld().removeObject(this);
                this.setLocation((int)(Math.random() * getWorld().getWidth()), 50);
                //getWorld().showText("Score", getWorld().getWidth(), getWorld().getHeight());
                //getWorld().Star().class.setCounter(1);
                //getWorld().addObject(new Flash(), this.getX(), this.getY());\
                //getWorld().removeObject(new Flash(), this.getX(), this.getY());
            }
        turnTowards(this.getX(), getWorld().getHeight());
        move((int)(Math.random()*4+1));
        if(isAtEdge()){
            this.setLocation((int)(Math.random() * getWorld().getWidth()), 50);
        }
    }    
}
