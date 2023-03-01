

public class Driver
{
    public static void main()
    {
        NumberCube c1 = new NumberCube(6);
        NumberCube c2 = new NumberCube(4);
        NumberCube c3 = new NumberCube(8);
        
        System.out.println("cube #1:\n");
        System.out.println(c1.getCubeTosses(c1, 15));
        System.out.println(c1.getLongestRun(c1.getCubeTosses(c1, 15)));
        System.out.println("--------------------------------");
        
        System.out.println("cube #2:\n");
        System.out.println(c2.getCubeTosses(c2, 15));
        System.out.println(c2.getLongestRun(c2.getCubeTosses(c2, 15)));
        System.out.println("--------------------------------");
        
        System.out.println("cube #3:\n");
        System.out.println(c3.getCubeTosses(c3, 15));
        System.out.println(c3.getLongestRun(c3.getCubeTosses(c3, 15)));
        System.out.println("--------------------------------");
    }
}
