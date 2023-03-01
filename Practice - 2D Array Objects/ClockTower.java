

public class ClockTower
{
    //private int[][] clockObjects;
    public static void main()
    {
        Clock[][] clockObjects = new Clock[10][10];
        
        for(int r = 0; r<clockObjects.length; r++)
        {
            for(int c = 0; c<clockObjects[0].length; c++)
            {
                int x = (int)(1 + Math.random() * 12);
                int y = (int)(Math.random() * 60);
                clockObjects[r][c] = new Clock(y,x);
            }
        }
        
        for(Clock[] x:clockObjects)
        {
            for(Clock b: x)
            {
                System.out.print(b +"\t" );
            }
            System.out.println("");
        }
    }
}
