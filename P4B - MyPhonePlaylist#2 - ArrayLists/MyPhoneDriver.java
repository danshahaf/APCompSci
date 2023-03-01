

public class MyPhoneDriver
{
    public static void main()
    {
        MyPhone phone1 = new MyPhone("Gold", 64);
        System.out.println(phone1.toString());
        System.out.println("----------------------");
        System.out.println("Total Play Time: " + phone1.totalPlayTime());
        System.out.println("----------------------");
        phone1.deleteAllSongs();
        System.out.println("Total Play Time: " + phone1.totalPlayTime());
        System.out.println("----------------------");
        System.out.println(phone1.toString());
    }
    
}
