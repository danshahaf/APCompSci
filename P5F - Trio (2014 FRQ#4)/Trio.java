

public class Trio implements MenuItem
{
    private String name;
    private double price;
    public Sandwich sandwich;
    public Salad salad;
    public Drink drink;
    public Trio()
    {
        name = null;
        price = 0.0;
    }
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    public String getName()
    {
        name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + "trio";
        return name;
    }
    public double getPrice()
    {
        if(sandwich.getPrice() > salad.getPrice())
        {
            price += sandwich.getPrice();
            if(salad.getPrice() > drink.getPrice())            
                price += salad.getPrice();            
            else
               price += drink.getPrice();            
        }
        else if(sandwich.getPrice() > drink.getPrice())
            price = salad.getPrice() + sandwich.getPrice();
        else
            price = salad.getPrice() + drink.getPrice();
           
        return price;
    }
}






