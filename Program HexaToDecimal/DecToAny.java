import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class DecToAny
{
    public static void main()
    {
        int counter = 0;
        int holder = 0;
        int base = Integer.parseInt(JOptionPane.showInputDialog("What Base Would Like To Convert To?"));
        ArrayList<Integer> digits = new ArrayList<Integer>();
        ArrayList<String> finalDigits = new ArrayList<String>();
        String[] hexaLetters = new String[]{"A", "B" , "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        int newNum = Integer.parseInt(JOptionPane.showInputDialog("Insert Decimal Number"));
        while(newNum > 0)//populating the d
        {
            counter = newNum%base;
            newNum = (int)(newNum/base);
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

