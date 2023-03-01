import javax.swing.JOptionPane;

public class StudentDriver{
    public static void main(){
        String last = JOptionPane.showInputDialog("last name please");
        String first = JOptionPane.showInputDialog("first name please");
        int age = Integer.parseInt(JOptionPane.showInputDialog("age please"));
        int grade = Integer.parseInt(JOptionPane.showInputDialog("grade please"));
        System.out.println("Last Name \t First Name \t Age \t Grade");
                
        Student student1 = new Student();
        System.out.println(student1);
        Student student2 = new Student("Dan", "Shahaf", 16, 11);
        System.out.println(student2);
        Student student3 = new Student(last, first, age, grade);
        System.out.println(student3);
    }
}