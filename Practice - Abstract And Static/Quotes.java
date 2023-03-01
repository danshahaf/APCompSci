

public class Quotes
{
    public static double PI = 3.14159;
    private static String[] array = {"Suh dude", "My name is Jeff","There are many fish in the ocean"};
    public static String getQuote()
    {
        int rand = (int)(Math.random()*array.length);
        return array[rand];
    }
}
