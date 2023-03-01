
  public class Math
{
    private String teacher;
    private int enrollment;
    public Math ()
    {
        this.teacher = null;
        this.enrollment = 0;
    }
    public Math (String teacher, int enrollment)
    {
        this.teacher = new String (teacher);
        this.enrollment = enrollment;
    }
    public int getEnrollment()
    {
        return this.enrollment;
    }
    public String getTeacher()
    {
        return this.teacher;
    }
    public String checkEnrollment()
    {
        String output = new String("");
        if(this.enrollment < 40)
        {
            output += "The class is not full yet";
        }
        else
        {
            output += "No room left in the class";
        }
        return output;
    }
    public String toString()
    {
        return "Teacher: " + this.teacher + "\n" + 
               "Enrollment: " + this.enrollment + "\n" ;
               //"---------------------------------------------";
    }
    
}

