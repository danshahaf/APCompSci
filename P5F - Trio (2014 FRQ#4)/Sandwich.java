

public class Sandwich implements MenuItem
{
    private String name;
    private double price;
    public Sandwich()
    {
        name = null;
        price = 0.0;
    }
    public Sandwich(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
}
