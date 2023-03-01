
public class Grandchild extends Son
{
    private String hairColor;
    public Grandchild(int gradeLevel, String hairColor)
    {
        super(gradeLevel);
        this.hairColor = hairColor;
    }
    public String getSaying()
    {
        return "Im a grandchild";
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        output += "\nHair color: " + this.hairColor;
        output += "\n"+getSaying();
        return output;
    }
}