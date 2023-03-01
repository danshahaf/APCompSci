

public class Salad implements MenuItem
{
    private String name;
    private double price;
    public Salad()
    {
        name = null;
        price = 0.0;
    }
    public Salad(String name, double price)
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

