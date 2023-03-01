import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class DecToHexa
{
    public static void main()
    {
        int counter = 0;
        int holder = 0;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        ArrayList<String> finalDigits = new ArrayList<String>();
        String[] hexaLetters = new String[]{"A", "B" , "C", "D", "E", "F"};
        int hexNum = Integer.parseInt(JOptionPane.showInputDialog("Insert Decimal Number"));
        while(hexNum > 0)//populating the d
        {
            counter = hexNum%16;
            hexNum = (int)(hexNum/16);
            digits.add(counter);
        }
        
        for(int i = digits.size()-1; i >= 0; i--)//converting to String and reversing
        {
            if(digits.get(i) > 9)
            {
                holder = digits.get(i) - 10;
                finalDigits.add(hexaLetters[holder]);
            }
            else
            {
                finalDigits.add(Integer.toString(digits.get(i)));
            }
            
        }
        
        
        for(int i = 0; i<finalDigits.size(); i++)
        {
            System.out.print(finalDigits.get(i));
        }
    }
}
