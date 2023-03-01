import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Disk extends Actor
{    
    private int timer;
    private int x;
    private int y;
    private int velo;
    private int score1;
    private int score2;
    private boolean check;
    private boolean pressed;
    private int randAngle;
    private List<Disk> disks;
    private int level;
    public boolean randomAllow;
    public Disk()
    {
        Table t = (Table)getWorld();
        this.velo = 5;
        check = true;
        pressed = false;
        randomAllow = false;
        disks = new ArrayList<Disk>();
    }
    public void act() 
    {
        disks = getWorld().getObjects(Disk.class);
        Table t = (Table)getWorld();
        
        if(check)//occurs once in game
        {
            level = Integer.parseInt(JOptionPane.showInputDialog("what level would you like to play? return number 1 - 5"));
            if(level > 3) randomAllow = true;
            check = false;
        }
        if(Greenfoot.mouseClicked(this))
        {
            if(randomAllow) randAngle = (int)(Math.random() * 361);
            else randAngle = 0;
            turn(randAngle);
            pressed = true;
        }
        if(pressed)
        {
            move(3 * level);
        }
        if(isTouching(Striker2.class))//hitting the AIStriker
        {
            timer++;
            if(disks.get(0).getX() > 250)
            {
                x = disks.get(0).getX() + 5;
                y = disks.get(0).getY() + 5;
            }
            else
            {
                x = disks.get(0).getX() - 5;
                y = disks.get(0).getY() + 5;
            }
            turnTowards(x,y );
        }
        if(isTouching(Striker1.class))//hitting the humanStriker
        {
            timer++;
            if(disks.get(0).getX() > Greenfoot.getMouseInfo().getX())
            {
                x = disks.get(0).getX() + 5;
                y = disks.get(0).getY() - 5;
            }
            else
            {
                x = disks.get(0).getX() - 5;
                y = disks.get(0).getY() - 5;
            }
           
        
            turnTowards(x,y );
        }
                
        if(this.getX() > getWorld().getWidth() - 75)//right boundary reflection
        {
            int angle = this.getRotation() - 270;
            this.setRotation(270 - angle);
           
        }
        else if(this.getX() < 75)//left boundary reflection
        {
            int angle = this.getRotation() - 270;
            this.setRotation(270 - angle);
          
        }
        else if(this.getY() < 60)//upper boundary reflection
        {
            int angle = 360 - getRotation();
            this.setRotation(angle);
           
        }
        else if(this.getY() > getWorld().getHeight() - 60)//lower boundary reflection
        {
            int angle = 360 - getRotation();
            this.setRotation( angle);
           
        }
        
        
        if(isTouching(Goal.class))//scoring lower Goal
        {
            score1++;
            pressed = false;
            this.setLocation(250,410);
            
        }
        else if(isTouching(Goal2.class))//scoring upper Goal
        {
            score2++;
            pressed = false;
            this.setLocation(250,410);
        }
        getWorld().showText("Score: " + Integer.toString(score1), 50, 50);
        getWorld().showText("Score: " + Integer.toString(score2), 450, 750);
    }    
    public int getTimer()
    {
        return timer;
    }
    public int getLevel()
    {
        return level;
    }
}
