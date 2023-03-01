

public class Daughter extends Parent
{
    private int gradeLevel;
    public Daughter(int gradeLevel)
    {
        super();
        this.gradeLevel = gradeLevel;
    }
    public String getSaying()
    {
        return "I wanna go shopping";
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        output += "\nGrade: " + this.gradeLevel;
        output += "\n" + getSaying();
        return output;
    }
}
