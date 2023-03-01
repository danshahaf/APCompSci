import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new BJ(5),0,0);
        //addObject(new BJ("2", 5, 16),200, 200);
        //addObject(new BJ("3", 5, 16),300, 400);
    }
}
