

public class Superhero
{
     private String SuitColor;
    private boolean SeriesMade;
    public Superhero()
    {
        String SuitColot = null;
        SeriesMade = false;
    }
    public Superhero (String SuitColor, boolean SeriesMade)
    {
        this.SuitColor = SuitColor;
        this.SeriesMade = SeriesMade;
    }
    public String getMotto()
    {
        return "AP Computer Science";
    }
    public String toString()
    {
        String output = new String("");
        output += "Color of Suit: " + SuitColor;
        output += "\nHave a TV Show? " + SeriesMade;
        output += "\nMotto: " + getMotto();
        return output;
    }
}
