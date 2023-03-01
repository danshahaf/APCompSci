import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BJ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BJ extends Actor
{
    /**
     * Act - do whatever the BJ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private int speed;
    private int age;
    public BJ(){//zero arg constructor
        name = null;
        speed = 0;
        age = 0;
    }
    public BJ(String name, int speed, int age){
        this.name=name;
        this.speed=speed;
        this.age=age;
    }
    public void act() 
    {
        move(speed);
        if(isTouching(BJ.class)){
            turn((int)(90*Math.random()+1));
        }
        if(isAtEdge()){
            turn((int)(90*Math.random()+1));
            move(speed);
        }
        if(name.equals("1")){
            getWorld().showText(toString(), 100,200);
        }
        else if(name.equals("2")){
            getWorld().showText(toString(), 300,200);
        }
        else if(name.equals("3")){
            getWorld().showText(toString(), 500,200);
        }
    }
    public String toString(){
        String output = new String("Name: " + name);
        output += ("\nSpeed: " + speed);
        output += ("\nAge: " + age);
        output += ("\n X coordinate is: " + getX());
        output += ("\n Y coordinate is: " + getY());
        return output;
    }
}
