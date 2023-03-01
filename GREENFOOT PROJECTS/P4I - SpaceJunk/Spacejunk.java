import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Spacejunk extends Actor
{
    private int altitude;
    public void act() 
    {
         move(10);
         if(isAtEdge())
         {
             turn((int)(90 * Math.random() + 90));
         }
         //getWorld().showText(Integer.toString(getAltitude()), getX(), getY());
         altitude -= 500;
    }    
    public Spacejunk(int altitude)
    {
        this.altitude = altitude;
        
    }
    public int getAltitude()
    {
        return altitude;
    }
    public void setAltitude(int altitude)
    {
        this.altitude = altitude;
    }
    public String toString()
    {
        String output = new String (" ");
        return output;
    }
}
