import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

public class MyWorld extends World
{
    private ArrayList<Actor> foods;
    private int x;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //addObject(new Ladybug(), (int)(Math.random()* getWidth()), (int)(Math.random()* getHeight()));
        //addObject(new Ladybug(), (int)(Math.random()* getWidth()), (int)(Math.random()* getHeight()));
        addObject(new Star(), getWidth()/2,  350);
        foods = new ArrayList<Actor>();
        for(int i = 0; i<6; i++)
        {
            int rand = (int)(Math.random() * 3+1);
            if(rand == 1)
            {
                addObject(new Ladybug(), (int)(Math.random() * getWidth()), 50);
                foods.add(new Ladybug());
                
            }
            if(rand == 2)
            {
                addObject(new Apple(), (int)(Math.random() * getWidth()), 50);
                foods.add(new Apple());
            }
            if(rand == 3)
            {
                addObject(new Banana(), (int)(Math.random() * getWidth()), 50);
                foods.add(new Banana());
            }
        }
        
        /*for(Actor food: foods)
        {
            int x = (int)(Math.random() * foods.size());
            addObject(new food(), (int)(Math.random() * getWidth()), 50);
        }*/
    }
}
