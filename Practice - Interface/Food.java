

public class Food implements Orderable
{
    private int calories;
    public Food()
    {
        calories = 0;
    }
    public Food(int calories)
    {
        this.calories = calories;
    }
    public String wasOrdered()
    {
        return "The item was ordered";
    }
    public String toString()
    {
        String output = new String("");
        output += "Calories: " + this.calories;
        return output;
    }
}
