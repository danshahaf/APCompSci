
public class Song
{
    private String title;
    private double price;
    private String artist;
    private int yearMade;
    public Song() {
        title = "Let it be";
        price = 1.29;
        artist = "Beatles";
        yearMade = 1970;
    }
    public Song(String titleArg, double priceArg, String artistArg, int yearMadeArg) {
        title = titleArg;
        price = priceArg;
        artist = artistArg;
        yearMade = yearMadeArg;
    }
    public String toString(){
        String output = new String();
        output += (title + "\t" + price + "\t\t" + artist + "\t\t" + yearMade);
        return output;
    }
}
