public class Pancake
{
    //instance variables
    private boolean hasSyrup;
    private int stack;
    private double price;
    //zero-argument constructor
    public Pancake()
    {
        System.out.println("The constructor has been called!");
        hasSyrup=true;
        stack = 10;
        price = 5.83;
    }
    //three argument constructor
    /*public Pancake(boolean syrupArg, int stackArg, double priceArg)
    {
        System.out.println("The 3-arg constructor has been called!");
        hasSyrup= syrupArg;//stores the instance variable of hasSyrup
        stack = stackArg;
        price = priceArg;
    }*/
    public Pancake(boolean hasSyrup, int stack, double price)
    {
        System.out.println("The 3-arg constructor has been called!");
        //"this" is setting the instance variable
        this.hasSyrup= hasSyrup;//stores the instance variable of hasSyrup
        this.stack = stack;
        this.price = price;
    }    
    //toString method
    public String toString()
    {
        String output = new String();
        if(hasSyrup) //same as hasSyrup == true
        {
            output = "The pancake has syrup";
        }
        else
        {
            output = "The pancake does not have syrup";
        }
        output += ("\n The stack has " + stack + " pancakes.");
        output += ("\n The is $" + price + ".");
        return output;
    }
}
