
import javax.swing.JOptionPane;
public class LeapYear
{
    
    public static void main()
    {
        int year;
        boolean leapYear;
        year = Integer.parseInt(JOptionPane.showInputDialog("Pick a year"));
        if(year % 4 == 0 && year % 100 != 0)
        {
            leapYear = true;
        }
        else if(year%400 == 0)
        {
            leapYear = true;
        }
        else
        {
            leapYear = false;
        }
        
        if(leapYear)
        {
            System.out.println("The year you pickes: " + year + " is a leap year!");
        }
        else
        {
            System.out.println("The year you pickes: " + year + " is NOT a leap year!");
        }
    }
}
