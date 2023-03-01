

public class Alien
{
    private int firepower;
    private String position;
    public Alien(int firepower, String position)
    {
        this.position = position;
        this.firepower = firepower;
    }
    public int getFirepower()
    {
        return firepower;
    }
    public void setFirepower(int firepower)
    {
        this.firepower = firepower;
    }
    public String getPosition()
    {
        return position;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    
}
