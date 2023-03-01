
public class Song
{
    private String title;
    //private double price;
    //private String artist;
    //private int yearMade;
    private int lengthInSec;
    /*public Song() {
        title = "Let it be";
        price = 1.29;
        artist = "Beatles";
        yearMade = 1970;
        lengthInSecs = 190;
    }*/
    public Song(String titleArg, int lengthInSec) {
        title = titleArg;
        //price = priceArg;
        //artist = artistArg;
        //yearMade = yearMadeArg;
        this.lengthInSec = lengthInSec;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    //getter - accessor method
    public int getLengthInSec()
    {
        return lengthInSec;
    }
    //setter - mutator method
    public void setLengthInSec(int newSeconds)
    {
        this.lengthInSec = newSeconds;
    }
    //convertor from seconds to minutes
    public String convertToMinSec()
    {
        //String finalMin;
        //String finalSec;
        //finalMin = Integer.toString(lengthInSec/60);
        //finalSec = Integer.toString(lengthInSec%60);
        //String newTime = new String();
        //newTime += (finalMin + " : " + finalSec);
        return lengthInSec/60+ " : " +lengthInSec%60;
    }
    public String getMinutes()
    {
        String finalMin;
        finalMin = Integer.toString(lengthInSec/60);
        return finalMin;
    }
    public String getSeconds()
    {
        String finalSec;
        finalSec = Integer.toString(lengthInSec);
        return finalSec;
    }
    public String toString(){
        String output = new String();
        output += (title +"\t" + convertToMinSec());
        return output;
    }
}

       