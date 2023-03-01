


    public class Algebra1 extends Math
{
    
    public Algebra1 ()
    {
        super();
    }
    public Algebra1 (String teacher, int enrollment)
    {
        super(teacher, enrollment);
    }
    public String checkEnrollment()
    {
        String output = new String("");
        if(super.getEnrollment() < 40)
        {
            output += "ALGEBRA class is not full yet";
        }
        else
        {
            output += "No room left in the ALGEBRA class";
        }
        return output;
    }
    /*public String toString()
    {
        return " Algebra 1 teacher: " + super.getTeacher() + "\n" + 
               "Enrollment: " + super.getEnrollment() + "\n" + 
               "---------------------------------------------";
    }*/
    
}

