public class MyPhone2Driver
{
    public static void main()
    {
        
        MyPhone2 phone2 = new MyPhone2("Gold", 64);
        System.out.println(phone2.toString());
        System.out.println("----------------------");
        System.out.println("Total Play Time: " + phone2.totalPlayTime());
        System.out.println("----------------------");
        phone2.deleteAllSongs();
        
        System.out.println(phone2.toString());
        //System.out.println("Total Play Time: " + phone2.totalPlayTime());
    }
    
}
