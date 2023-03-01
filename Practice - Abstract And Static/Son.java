

public class Son extends Parent
{
    public int gradeLevel;
    public Son(int gradeLevel)
    {
        super();
        this.gradeLevel = gradeLevel;
    }
    public String getSaying()
    {
        return "Can I get some money?";
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        output += "\nGrade: " + this.gradeLevel;
        output += "\n"+getSaying();
        return output;
    }
}
