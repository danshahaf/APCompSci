import java.util.ArrayList;
public class ClassRoster
{
    private String courseName;
    private ArrayList<Student> studentList;
    public ClassRoster(String courseName)
    {
        courseName = this.courseName;
        studentList = new ArrayList<Student>();
        Student s1 = new Student("Shahaf",3.9);
        Student s2 = new Student("Justin", 4.2);
        Student s3 = new Student("Nakil", 3.3);
        Student s4 = new Student("Jason", 2.8);
        Student s5 = new Student("Owen", 3.0);
        
        
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        
    }
    public String studentWithMaxGPA()
    {
        double goat = 0.0;
        String best = "";
        for(Student currentStudent: studentList)
        {
            if(currentStudent.getGPA() > goat)
            {
                goat = currentStudent.getGPA();
                best = currentStudent.getName();
            }
        }
        return best;
    }
    public int dropStudent( double minGradeLevel)
    {
        int counter = 0;
        for(int i = studentList.size(); i<=0; i--)
        {
            if(studentList.get(i).getGPA() < minGradeLevel)
            {
                studentList.remove(i);
                counter ++;
            }
        }
        return counter;
    }
    public void addStudent(Student newStudent)
    {
        studentList.add(newStudent);
    }
    public String toString()
    {
        String output = new String("");
        output += "In the class: " + courseName;
        output += "\nStudent with best GPA: " + studentWithMaxGPA();
        //output += "Amount of Student dropped: " + dropStudent();
        return output;
    }
}






















