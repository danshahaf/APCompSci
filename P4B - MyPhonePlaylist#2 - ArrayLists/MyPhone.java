import java.util.ArrayList;

public class MyPhone
{
    private String color;
    private int GB;
    private ArrayList<Song> songLibrary;
    public MyPhone(String color, int GB)
    {
        this.color = color;
        this.GB = GB;
        this.songLibrary = new ArrayList<Song>();
        Song s1 = new Song("Wings" , 312);
        Song s2 = new Song("Can't Hold Us" , 225);
        Song s3 = new Song("Man of the Year" , 182);
        Song s4 = new Song("Radio" , 257);
        
        songLibrary.add(s1);
        songLibrary.add(s2);
        songLibrary.add(s3);
        songLibrary.add(s4);
    }
    public int totalPlayTime()
    {
        int total = 0;
        for(int i = 0; i<songLibrary.size(); i++)
        {
            total += songLibrary.get(i).getLengthInSec();
        }
        return total;
    }
    public void deleteAllSongs()
    {
        /*for(Song currentSong: songLibrary)
        {
            currentSong.setTitle(null);
            currentSong.setLengthInSec(0);
        }*/
        for(int i = 0; i<songLibrary.size(); i++)
        {
            songLibrary.remove(i);
            i--;
        }
        //for loop - remove do not set to null
        //try as a for each loop first
    }
    public String printSongs()
    {
        String totalTitle = new String();
        for (int i = 0; i<songLibrary.size(); i++)
        {
            totalTitle += "\n" + songLibrary.get(i).getTitle();
        }
        return totalTitle;
    }
    public String toString()
    {
        String output = new String();
        output += "color: " + color;
        output += "\nMemory Capacity: " + GB + "GB";
        output += "\nPlaylist contains: " + printSongs();
        return output;
    }
}
