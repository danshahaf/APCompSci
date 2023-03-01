public class SongDriver
{
    public static void main()
    {
        System.out.println("Title\t\t\tPrice\t\tArtist\t\t\tYear Made\t\tLength In Seconds\t\tFinal Time");
        Song song1 = new Song("Holding On To You", 0.99, "TwentyOnePilots", 2011, 321);
        System.out.println(song1);
        System.out.println("length in seconds: " + song1.getLengthInSec());
        
        song1.setLengthInSec(215);
        System.out.println("length in seconds: " + song1.getLengthInSec());
        System.out.println(song1.toString());
        
        System.out.println("Song's Minutes: "+song1.getMinutes());
        System.out.println("Song's Seconds: "+song1.getSeconds());
        //Song goToSleepSong= new Song("Holding On To You", 0.99, "TwentyOnePilots", 2011);
        //System.out.println(goToSleepSong);
    }
    
}
   

        