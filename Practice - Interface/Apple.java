

public class Apple extends Food
{
    private String color;
    public Apple()
    {
        super();
        color = null;
        
    }
    public Apple(int calories, String color)
    {
        super(calories);
        this.color = color;
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        output += "\nColor: " + this.color;
        return output;
    }
}
