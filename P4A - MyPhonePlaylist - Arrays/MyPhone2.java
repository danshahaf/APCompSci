import java.util.ArrayList;

public class MyPhone2
{
    private String color;
    private int GB;
    private  Song[]songLibrary;
    public MyPhone2(String color, int GB)
    {
        this.color = color;
        this.GB = GB;
        this.songLibrary = new Song[4];
        Song s1 = new Song("Wings" , 312);
        Song s2 = new Song("Can't Hold Us" , 225);
        Song s3 = new Song("Man of the Year" , 182);
        Song s4 = new Song("Radio" , 257);
        
        songLibrary[0] = s1;
        songLibrary[1] = s2;
        songLibrary[2] = s3;
        songLibrary[3] = s4;
    }
    public int totalPlayTime()
    {
        int total = 0;
        for(int i = 0; i<songLibrary.length; i++)
        {
            //songLibrary.get(i).setLengthInSec(0);
            total += songLibrary[i].getLengthInSec();
        }
        return total;
    }
    public void deleteAllSongs()
    {
        for(int i = 0; i<songLibrary.length; i++)
        {
            songLibrary[i] = null;
            //songLibrary[i].setLengthInSec(0);
        }
        /*for(Song currentSong: songLibrary)
        {
            Song.setTitle(null);
        }*/
    }
    public String printSongs()
    {
        String totalTitle = new String();
        for (int i = 0; i<songLibrary.length; i++)
        {
            if(songLibrary[i] != null)
            {
                totalTitle += "\n" + songLibrary[i].getTitle();
            }
            
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
