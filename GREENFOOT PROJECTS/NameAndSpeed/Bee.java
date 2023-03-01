import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private String name;
    public Bee(){//Zero arg constructor
        speed = 15;
        name = "Rodney";
        
    }
    public Bee(int speed, String name){//2arg constructor
        this.speed = speed;
        this.name = name;
    }
    public void act() 
    {
        if(isAtEdge()){
            turn((int)(90*Math.random()+1));
            move(speed);
        }
        move(speed);
        if (speed == 5){
            getWorld().showText(toString(), 800,300);
        }
        else if (speed == 15){
            getWorld().showText(toString(),300,300);
        }
       
    }    
    public String toString(){
        String output =  new String("The name of this Bee is: " + name);
        output += ("\n Speed is: " + speed);
        output += ("\n X coordinate is: " + getX());
        output += ("\n Y coordinate is: " + getY());
        return output;
    }
}
