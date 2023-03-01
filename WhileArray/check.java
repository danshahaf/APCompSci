import javax.swing.JOptionPane;
public class check
{
    public static void main()
    {
        int number = 0;
        while(number < 10 || number >20)
        {
            number = Integer.parseInt(JOptionPane.showInputDialog("Please pick a number"));
            
        }
        int[] array = new int[number];
        for(int i=0; i<array.length; i++)
        {
            array[i] = (int)(101*Math.random());
            System.out.print(array[i] + "  ");
        }
        int goat = 0;
        int low = 100;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] > goat) 
                 goat = array[i];
            if(array[i]<low)
                 low = array[i];
            
        }
        System.out.println("\ngreatest: " + goat);
        System.out.println("lowest: " + low);
            

        
        
        
        
        
        
    }
}


