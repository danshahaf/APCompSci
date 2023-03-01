

public class TheFlash extends Superhero
{
    private int speed;
    private String SuitColor;
    private boolean SeriesMade;
    public TheFlash()
    {
        super();
        int speed = 0;
    }
    public TheFlash (int speed, String SuitColor, boolean SeriesMade)
    {
        super(SuitColor, SeriesMade);
        this.speed = speed;
    }
    public String getMotto()
    {
        return "I am the Fastest Man Alive";
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        output += "\nSpeed: " + speed + "km/s";
        return output;
    }
}
