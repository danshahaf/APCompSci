import javax.swing.JOptionPane;

public class UP
{
    public static void main()
    {
        String username = JOptionPane.showInputDialog("Username?");
        String password = JOptionPane.showInputDialog("Password?");
        
        //&& is and     both need to evaluate to be true
        // || is "or"...at least one need to evaluate to be true
        if(username.equals("Justin") && password.equals("Watson"))
            System.out.println("Access granted");
        else
            System.out.println("Access denied");
            
    }
}
    