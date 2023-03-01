

public class DoubleArray
{
    public static void main()
    {
        //1D Array
        int[] even1D = new int[10];
        int counter = 0;
        int number = 0;
        int d = 0;
        for(int i = 0; i<even1D.length; i++)
        {
            even1D[i] = counter;
            counter += 2;
        }
        for(int x: even1D)
        {
            System.out.print(x +"\t");
        }
        
        //2D Array
        int[][] even2D = new int[4][5];
        
        for(int i = 0; i<even2D[0].length; i++)
        {
            for(int b = 0; b <even2D.length; b++)
            {
                if(number < even1D.length)
                {
                    even2D[b][i] = even1D[d];
                    d++;
                    number++;
                }
                else
                {
                    even2D[b][i] = -1;
                }
            }
        }
        
        
        
        
        //printing
        System.out.println("\n---------------------");
        for(int[] r: even2D)
        {
            for(int c: r)
            {
                
                System.out.print(c + "\t");
            }
            System.out.println("");
        }
    }
}
