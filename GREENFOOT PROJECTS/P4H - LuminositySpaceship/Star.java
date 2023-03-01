import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Star extends Actor
{
    private int luminosity;
    public void act() 
    {
        //luminosity--;
        if(luminosity <= 0)
        {
            getWorld().removeObject(this);
            luminosity = 0;
            
        }
        else
        {
            luminosity--;
            getWorld().showText(Integer.toString(getLuminosity()), getX(), getY());
        }
        //String locX = getX();
        //String locY = getY();
        //getWorld().showText(Integer.toString(getLuminosity()), getX(), getY());
    }
    public Star()
    {
        luminosity = (int)(500*Math.random() + 500);
    }
    public int getLuminosity()
    {
        return luminosity;
    }
    public void setLuminosity(int luminosity)
    {
        this.luminosity = luminosity;
    }
    public String toString()
    {
        String output = new String(" ");
        //output += "Luminosity: " + getLuminosity();
        //output += 
        return output;
    }
}
