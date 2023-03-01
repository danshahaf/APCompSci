import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BJ extends Actor
{
    
    //private String name;
    private int speed;
    //private int age;
    private boolean isMissionAccomplished = false;
    private int xCor;
    private int yCor;
    //private int newX = getWorld().getWidth()/2;
    //private int newY = getWorld().getHeight()/2;
    public BJ(){//zero arg constructor
        //name = null;
        speed = 0;
        //age = 0;
    }
    public BJ(int speed){
        //this.name=name;
        this.speed=speed;
        //this.age=age;
    }
    public void act() 
    {
        move(speed);
        xCor = getX();
        yCor = getY();
        if(xCor == getWorld().getWidth()-1)
        {
            move(1);
            turn(90);
            move(1);
            turn(90);
            move(speed);
        }
        else if(xCor == 0)
        {
            move(1);
            turn(270);
            move(1);
            turn(270);
            move(speed);
        }
        getWorld().showText(toString(), 300, 350);
        if(xCor == getWorld().getWidth()-1 && yCor == getWorld().getHeight()-1)
        {
            setLocation((getWorld().getWidth())/2, getWorld().getHeight()/2);
            speed = 0;
            isMissionAccomplished = true;
            //Greenfoot.stop();
            
        }
        /*if(isTouching(BJ.class)){
            turn((int)(90*Math.random()+1));
        }
        if(isAtEdge()){
            //turn((int)(90*Math.random()+1));
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
        }*/
    }
    public String toString(){
        String output = new String("\nSpeed: " + speed);
       // output += ("\nSpeed: " + speed);
        //output += ("\nAge: " + age);
        output += ("\n(" + getX()+"  ,   " + getY()+")");
        if(isMissionAccomplished)
        {
            output += "\nMission Accomplished!";
            Greenfoot.stop();
        }
        //output += ("\n Y coordinate is: " + getY());
        return output;
    }
}
