
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class HexAToDec
{
    public static void main()
    {
        int counter = 1;
        boolean letter = false;
        int holder = 0;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        String helper = "";
        String[] hexaLetters = new String[]{"A", "B" , "C", "D", "E", "F"};
        String hexNum = JOptionPane.showInputDialog("Insert HexaDecimal Number");
        for(int i = hexNum.length()-1; i>0; i--)
        {//converting from letters and number that are strings to groups of number from 1 to 16
            helper = hexNum.substring(i-1,i);
            if(helper.equals("A" || "B" || "C" || "D" || "E" || "F" ){
                
            }
            for(int b = 0; b<hexaLetters.length; b++)
            {
                if(hexNum.substring(i-1, i).equals(hexaLetters[b]))
                {
                    digits.add(10+b);
                    
                }
                
                
            }
            if(!letter)
            {
                digits.add(Integer.parseInt(hexNum.substring(i-1,i)));
            }
        }
        for(int a = digits.size()-1;a>=0; a--)
        {//converting to a one, decimal number
            holder += counter*digits.get(a);
            counter*=16;
        }
    
        System.out.println(holder);
        
        
    }
}
