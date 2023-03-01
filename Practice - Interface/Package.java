

public class Package implements Orderable
{
    private double weight;
    public Package()
    {
        
        weight = 0.0;
    }
    public Package(double weight)
    {
        
        this.weight = weight;
    }
    public String wasOrdered()
    {
        return "The package was ordered";
    }
    public String toString()
    {
        String output = new String("");
        
        output += "\nWeight: " + this.weight;
        return output;
    }
}
