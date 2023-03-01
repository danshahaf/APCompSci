import javax.swing.JOptionPane;

public class StringEqual
{
    public static void main()
    {
        String school = JOptionPane.showInputDialog("What school do you go to?");        
        
        //if(school == "Granada")) does not work because Strings are different objects
        if (school.equals("Granada"))
            System.out.println("We to the same school");
        else
            System.out.println("We don't go to the same school");
    }
}
