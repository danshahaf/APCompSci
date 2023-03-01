import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private int x = 0;
    private int y = 0;
    
    public MyWorld()
    {    
         super(600, 400, 1); 
        for(int i = 0; i < 6; i++)
        {
            x = (int)(500 * Math.random() + 50);
            y = (int)(300 * Math.random() + 50);
            addObject(new Spacejunk((int)(200000 * Math.random())),x , y );
        }
       addObject(new Spaceship(5),250 , 250 );
    }
}
