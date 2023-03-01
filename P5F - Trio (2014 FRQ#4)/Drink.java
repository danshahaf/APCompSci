
public class Drink implements MenuItem
{
    private String name;
    private double price;
    public Drink()
    {
        name = null;
        price = 0.0;
    }
    public Drink(String name, double price)
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
