import javax.swing.JOptionPane;
public class ForLoop
{
    public static void method()
    {
        
        
        String agest = JOptionPane.showInputDialog("Age");
        double age = Double.parseDouble(agest);


        
        
        //for loops (int variable = somenumber); (range); (increment operator)
        //i++ is an increment operator, adds 1 to i     
        for(int i=0; i<15; i++)
        {
            System.out.println("In "+ (i+1) + " year(s), I will be " + (age + i + 1));
        }       
    }
    
}
