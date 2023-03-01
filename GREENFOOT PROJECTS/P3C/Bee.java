import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bee extends Actor
{
    
    private int speed;
    private String name;
    private int xDestination;
    private int yDestination;
    private double distance;
    public double time;
    public Bee(){//Zero arg constructor
        speed = 15;
        name = "Rodney";
        
    }
    public Bee(int speed, String name, int xDestination, int yDestination){//2arg constructor
        this.speed = speed;
        this.name = name;
        this.xDestination = xDestination;
        this.yDestination = yDestination;
        
    }
    public void act() 
    {
        if(isAtEdge()){
            turn((int)(90*Math.random()+1));
            move(speed);
        }
        move(speed);
        getWorld().showText(toString(), getWorld().getWidth()/2 ,50);
        
        getWorld().showText( "Distance to destination is: " + calcTripDistance() + " km", getWorld().getWidth()/2, getWorld().getHeight() - 100 );
        getWorld().showText( "Time to destination is: " + calcTripTravelTime() + " Seconds", getWorld().getWidth()/2, getWorld().getHeight() - 150 );
    }    
    public double calcTripDistance(){
        distance = Math.sqrt(((yDestination - getY())*(yDestination - getY())) + ((xDestination - getX())*(xDestination - getX())));
        return distance;
    }
    public double calcTripTravelTime()
    {
        time = calcTripDistance()/speed;
        return time;
    }
    public String toString(){
        String output =  new String("The name of this Bee is: " + name);
        output += ("\n Speed is: " + speed);
        output += ("\n X coordinate is: " + getX());
        output += ("\n Y coordinate is: " + getY());
        return output;
    }
}
