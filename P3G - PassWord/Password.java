import javax.swing.JOptionPane;
public class Password
{
   public static void main()
   {
       boolean okay = false;
       boolean alright = false;
       String b = " ";
       String password = " ";
       while(okay == false || alright == false)
       {
           password = JOptionPane.showInputDialog("Insert your new password");
           if(password.length() >= 6)
           {
               okay = true;
               for(int i = 0; i < password.length(); i ++)
           {
               b = password.substring(i, i+1);
               if(b.equals("@")||b.equals("+")||b.equals("-")||b.equals("/")||b.equals("*"))
               {
                   alright = true;
               }
           
           }
           }
           
       }
       
           System.out.println("your password is just fine");
       
       
   }
}
