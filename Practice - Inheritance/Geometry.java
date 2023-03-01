

public class Geometry extends Math
{
    private String teacher;
    private int enrollment;
    private boolean proofs;
    public Geometry ()
    {
        super();
        this.proofs = false;
    }
    public Geometry (String teacher, int enrollment, boolean proofs)
    {
        super(teacher, enrollment);
        this.proofs = proofs;
    }
    public String checkEnrollment()
    {
        String output = new String("");
        if(this.enrollment < 40)
        {
            output += "GEOMETRY class is not full yet";
        }
        else
        {
            output += "No room left in the GEOMETRY class";
        }
        return output;
    }
    public String toString()
    {
        return super.toString() +
               "Proofs: " + this.proofs + "\n" + 
               "---------------------------------------------";
    }
    
}











