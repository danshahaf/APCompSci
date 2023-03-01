
public class Student
{
    private String lastName;
    private String firstName;
    private int age;
    private int grade;
    public Student()
    {
        lastName = null;
        firstName = null;
        age = 0;
        grade = 0;
    }
    public Student(String lastNameArg, String firstNameArg, int ageArg, int gradeArg)
    {
        lastName = lastNameArg;
        firstName = firstNameArg;
        age = ageArg;
        grade = gradeArg;
    }
    
    public String toString() {
        String output = new String();
        output += ("\n" + lastName + "\t\t" + firstName + "\t\t" + age + "\t\t" + grade);
        return output;
    }
}
