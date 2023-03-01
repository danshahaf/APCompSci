import javax.swing.JOptionPane;


public class question
{
    public static void main()
    {
        String low = JOptionPane.showInputDialog("Please enter a low value");
        String high = JOptionPane.showInputDialog("Please enter a high value");
        
        int lowv = Integer.parseInt(low);
        int highv = Integer.parseInt(high);
        
        while(lowv>=highv)
        {
            System.out.println("Error! Please make sure your high value is greater than your low value.");
            low = JOptionPane.showInputDialog("Please enter a low value");
            high = JOptionPane.showInputDialog("Please enter a high value");
        
            lowv = Integer.parseInt(low);
            highv = Integer.parseInt(high);
        }
        int dif = (highv - lowv);
        int[] rangeArray = new int[10];
        int odd = 0;
        int even = 0;
        for (int i=0; i<10; i++)
        {
            rangeArray[i] = (int)((dif+1)*Math.random()+lowv);
            int remainder = rangeArray[i]%2;
            
            if (remainder == 1)
            {
                System.out.println(rangeArray[i] + "\t odd");
                odd++;
            }
            if (remainder == 0)
            {
                System.out.println(rangeArray[i] + "\t even");
                even++;
            }
        }
        System.out.println("Number of odds = " + odd);
        System.out.println("Number of evens = " + even);
    }
}