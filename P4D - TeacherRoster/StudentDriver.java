

public class StudentDriver
{
    public static void main()
    {
        ClassRoster cr1 = new ClassRoster("Computer Science");
        System.out.println(cr1.toString());
        cr1.dropStudent(3.0);
        Student s6 = new Student("Bryan", 4.4);
        cr1.addStudent(s6);
        System.out.println(cr1.toString());
    }
    
}
