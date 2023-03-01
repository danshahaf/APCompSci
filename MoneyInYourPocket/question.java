import javax.swing.JOptionPane;

public class question
{
    public static void main()
    {
        String amount = JOptionPane.showInputDialog("Money in pocket");
        
        System.out.println("You have $" + amount);
        
        //Integer class, calling the parseInt method
        double money = Double.parseDouble(amount);
        //   = assigner , changes value
        // == boolean, checks if two values are equal
        // != not equals
        if(money != 100) //an if statement evaluates a boolean to be true of false
        {
            System.out.println("You do not have $100");
        }
        else
        {
            System.out.println("You have $100");
        }
        System.out.println("You actually have $" + money);
    }
}
