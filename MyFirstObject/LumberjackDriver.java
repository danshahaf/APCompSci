public class LumberjackDriver
{
    public static void main()
    {
        //we can create ints, Strings, doubles etc.
        int number= 12;
        //String is a class, so name is an object of the String class
        String name = new String();
        
        //we can similarly create a Lumberjack object
        Lumberjack steve = new Lumberjack();
        //the line above will execute the constructor of the Lumberjack class
        System.out.println(steve);
    }
    
}