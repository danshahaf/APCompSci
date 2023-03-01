

public class Pizza extends Food
{
    private String toppings;
    public Pizza()
    {
        super();
        toppings = null;
    }
    public Pizza(int calories, String toppings)
    {
        super(calories);
        this.toppings = toppings;
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        output += "\nToppings: " + this.toppings;
        return output;
    }
}
