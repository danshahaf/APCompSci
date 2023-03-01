public class SongDriver
{
    public static void main()
    {
        System.out.println("Title\t\tPrice\t\tArtist\t\tYear Made");
        Song wakeUpSong = new Song();
        System.out.println(wakeUpSong);
        Song goToSleepSong= new Song("Holding On To You", 0.99, "TwentyOnePilots", 2011);
        System.out.println(goToSleepSong);
    }
}
   

        