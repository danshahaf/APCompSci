import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
public class Fly extends Actor
{
    private List<Star> starData;
    private List<Star> stars;
    private int speed;
    //private double avgLumi;
    //private double maxLumi;
    //private ArrayList<Star> stars;
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            turn((int)(90 * Math.random() + 90));
        }
         
        getWorld().showText("Avg: " + (Double.toString(calcAverageLuminosity()) + "\nMax: " + Double.toString(calcMaxLuminosity())), 50, 50);
        if(calcAverageLuminosity() == 0.0)
        {
            getWorld().showText("No Stars left", 525, 375);
            speed = 0;
        }
    }    
    public Fly(int speed)
    {
        stars = new ArrayList <Star> ();
        this.speed = speed;
    }
    public double calcAverageLuminosity()
    {
        double totalLumi = 0.0;
        double avg = 0.0;
        stars = getWorld().getObjects(Star.class);
        starData = getWorld().getObjects(Star.class);
        for(Star x: stars)
        {
            totalLumi += (double)(x.getLuminosity());
            
        }
        avg =  totalLumi/stars.size();
        
        return (int)avg;
    }
    public double calcMaxLuminosity()
    {
        double max = 0.0;
        for(int i = 0; i<starData.size(); i ++)
        {
            if(starData.get(i).getLuminosity() > max)
            {
                max = starData.get(i).getLuminosity();
            }
        }
        return max;
    }
}












