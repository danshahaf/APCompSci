import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Star extends Actor
{
    private int counter = 0;
    public void act() 
    {
        
        if(Greenfoot.isKeyDown("right")){
                
                setRotation(0);
                move(5);
                
            }       
            else if(Greenfoot.isKeyDown("left")){
                
                setRotation(180);
                move(5);
                       
            }
        if(isTouching(Ladybug.class) || isTouching(Banana.class) || isTouching(Apple.class))
        {
            counter ++;
        }
        
        getWorld().showText("Score: " + counter, getWorld().getWidth()-50, getWorld().getHeight()-30);
            
    }
    //public void setCounter(int counter){
      //  counter++;
        
    //}
    public int toInt(){
        //String output  = new String();
        //output += "Score: " + String.parseString(counter);
        //return output;
        return counter;
    }
}



