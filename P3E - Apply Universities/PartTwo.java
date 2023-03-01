import javax.swing.JOptionPane;

public class PartTwo
{
    public static void main()
    {
        int[] array = new int[]{-9,2,3,4,7,7,10,23,45,67};
        boolean a = false;;
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(array[i] + "   ");
        }
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insert the Number You Would Like to search In Array"));
        for(int i = 0; i < array.length; i++)
        {
            if(x == array[i])
            {
                System.out.println(" \n The number's index number is: " + (i+1));
                a = true;
            }
            else if(i == array.length-1)
            {
                if(x != array[i] && a == false)
                {
                    System.out.println("\nnumber NOT found");
                }
            }
            
        }
    }
}
