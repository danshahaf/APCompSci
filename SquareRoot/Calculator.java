import javax.swing.JOptionPane;
public class Calculator
{
    public static void main()
    {
        String a = JOptionPane.showInputDialog("Value of A?");        
        String b = JOptionPane.showInputDialog("Value of B?");        
        String c = JOptionPane.showInputDialog("Value of C?");
        
        double A = Double.parseDouble(a);        
        double B = Double.parseDouble(b);        
        double C = Double.parseDouble(c);
        
        while((4*A*C)>(B*B))
        {
            System.out.print("Error!! Please print valid numbers");
            a = JOptionPane.showInputDialog("Value of A?");
            A = Double.parseDouble(a);
            b = JOptionPane.showInputDialog("Value of B?");
            B = Double.parseDouble(b); 
            c = JOptionPane.showInputDialog("Value of C?");
            C = Double.parseDouble(c);
        }
        System.out.println("The value of B^2 is " + B*B);        
        System.out.println("The value of 4AC is " + 4*A*C);        
        System.out.println("The value of √B^2-4AC is " + Math.sqrt((B*B)-(4*A*C)));        
        System.out.println("One of the roots is " + (((-1)*B+(Math.sqrt((B*B)-(4*A*C)))))/(2*A));    
        System.out.println("The other root is " + (((-1)*B-(Math.sqrt((B*B)-(4*A*C)))))/(2*A));  
    }
}