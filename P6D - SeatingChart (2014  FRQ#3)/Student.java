

public class Student
{
    private String name;
    private int absenceCount;
    public Student()
    {
        name = null;
        absenceCount = 0;
    }
    public Student(String name, int absenceCount)
    {
        this.name = name;
        this.absenceCount = absenceCount;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAbsenceCount()
    {
        return this.absenceCount;
    }
}
