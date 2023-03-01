import greenfoot.*;
//AI striker to move back to defend faster
//reaasign boundaries locations
public class Table extends World
{ 
    private Striker1 s1;
    private Striker2 s2;
    private Disk d1;
    private Goal2 g1;
    private Goal g2;
    private int x;
    private int y;
    private int timer;//not using
    private int recordX;
    private int recordY;
    private int rX2;
    private int rY2;
    private double dist;//not using
    private double v;//not using
    private int leg1;//not using
    private int leg2;//not using
    public Table()
    {     
        super(500, 800, 1);         
         s1 = new Striker1();
         s2 = new Striker2();
        d1 = new Disk();
        g1 = new Goal2();
        g2 = new Goal();        
        addObject(g1, 250, 57);
        addObject(g2, 250, 760);
        addObject(s1, 250, 730);
        addObject(s2, 250, 85);
        addObject(d1, 250, 410);  
        addObject(new Title(), 250, 25);
    }
    public void act()
    {        
        
        if(Greenfoot.mousePressed(s1))
        {           
            recordX = Greenfoot.getMouseInfo().getX();
            recordY = Greenfoot.getMouseInfo().getY();
            timer++;
        }
        if(Greenfoot.mouseDragged(s1))
        {
            x = Greenfoot.getMouseInfo().getX();
            y = Greenfoot.getMouseInfo().getY();
            
            if(x > 75 && x < 425 && y > 405 && y < 740)
            {
                s1.setLocation(x, y);               
            }
        }
        if(Greenfoot.mouseDragEnded(s1))
        {
            rX2 = Greenfoot.getMouseInfo().getX();
            rY2 = Greenfoot.getMouseInfo().getY();
            leg1 = (int)(Math.abs(rX2 - recordX));
            leg2 = (int)(Math.abs(rY2 - recordY));
            dist = Math.sqrt((leg1 * leg1) + (leg2 * leg2));
            v = (double)(dist)/(30*timer);
        }       
    }
    public int getRecordX()
    {
       return recordX;    
    }
    public int getRecordY()
    {
        return recordY;
    }
    public double getVelocity()
    {
       return v;
    }
    public int getDistance()
    {
        return (int)(dist);
    }
}
