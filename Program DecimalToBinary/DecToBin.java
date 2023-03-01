import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class DecToBin
{
    //int holder = 0;
    public static void main()
    {
        double holder = 0;
        ArrayList <Integer> finalNums = new ArrayList <Integer>();
        int decNumber = Integer.parseInt(JOptionPane.showInputDialog("Number please"));
        holder = decNumber/2;
        while(holder / 2 > 1)
        {
            if(decNumber % 2 == 0)
            {
                finalNums.add(1);
                holder = decNumber/2;
                decNmuber = decNumber%2;
                
            }
            else
            {
                finalNums.add(0);
                holder = decNumber/2.0;
                decNmuber = decNumber%2;
            }
            
        }
        finalNums.add(holder);
        for(int i = finalNums.size() - 1; i >= 0; i--)
        {
            System.out.print(finalNums.get(i));
        }
    }
}
