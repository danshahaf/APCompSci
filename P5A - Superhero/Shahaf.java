

public class Shahaf extends Superhero
{
    private String SuitColor;
    private boolean SeriesMade;
    public Shahaf()
    {
        super();
    }
    public Shahaf (String SuitColor, boolean SeriesMade)
    {
        super(SuitColor, SeriesMade);
    }
    public String getMotto()
    {
        return "AP Computer Science 2017";
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        return output;
    }
}
