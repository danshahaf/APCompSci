import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed;
    private int batteryLevel;
    private String direction;
    private int counter;
    
    public Robot(int speed, int batteryLevel, String direction){
        this.speed=speed;
        this.batteryLevel=batteryLevel;
        this.direction=direction;
        this.counter=0;
    }
    
    public void act() 
    {
        if(counter==3){
                batteryLevel--;
                counter=0;
            }
        if(batteryLevel>=0){
            if(Greenfoot.isKeyDown("D")){
                direction="Right";
                setRotation(0);
                move(speed);
                counter++;
            }       
            else if(Greenfoot.isKeyDown("A")){
                direction="Left";
                setRotation(180);
                move(speed);
                counter++;            
            }
            else if(Greenfoot.isKeyDown("W")){
                direction="Up";
                setRotation(270);
                move(speed);
                counter++;
            }
            else if(Greenfoot.isKeyDown("S")){
                direction="Down";
                setRotation(90);
                move(speed);
                counter++;
            }
            

            
            
            getWorld().showText(toString(), 100,200);
            
        }
        
        else
        {
            getWorld().showText("Game Over", 500,500);
        }
        System.out.println("Baterry: "+batteryLevel);
    }
    public String toString(){
        String output = new String("Speed= "+speed);
        output += ("\nBattery="+batteryLevel+" %");
        output += ("\nDirection= " + direction);
        return output;
    }
}
