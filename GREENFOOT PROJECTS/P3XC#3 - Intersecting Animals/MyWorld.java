import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.util.ArrayList;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1); 
        
        
        for(int i = 0; i<5;i++)
        {
            for(int b=0; b<5; b++)
            {
                addObject(new Plural(), 75*(b+1), 75*(i+1));
                
            }
        }
        addObject(new Singular(5), 500, 200);
    }
}
