

public class BaseballCard
{
    //this 
    private String name;
    private double value;
    
    public BaseballCard(String name, double value)
    {
        this.name = name;
        this.value = value;
    }
    public String getName()
    {
        return name;
    }
    public double getValue()
    {
        return value;
    }
    public String toString()
    {
        String output = new String("");
        output += "name: " + name;
        output += "value: " + value;
        return output;
    }
}
