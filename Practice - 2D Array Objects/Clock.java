

public class Clock
{
    private int minutes;
    private int hours;
    public Clock()
    {
        minutes = 0;
        hours = 0;
    }
    public Clock(int minutes, int hours)
    {
        this.minutes = minutes;
        this.hours = hours;
    }
    public String toString()
    {
        String output = new String("");
        if(minutes <10)
        {
            output += "Time: " + hours + ":0" + minutes;
        }
        else
        {
            output += "Time: " + hours + ":" + minutes;
        }
        
        return output;
    }
}
