public class PancakeDriver
{
    public static void main()
    {
        Pancake pancake1 = new Pancake();
        System.out.println(pancake1.toString());
        Pancake pancake2 = new Pancake(true, 100, 4.99);
        System.out.println(pancake2);
        Pancake pancake3 = new Pancake(false,1,100.99);
    }
}