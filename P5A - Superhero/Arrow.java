import javax.swing.JOptionPane;

public class Arrow extends Superhero
{
    private String SuitColor;;
    private boolean SeriesMade;
    
    public Arrow()
    {
        super();
    }
    public Arrow (String SuitColor, boolean SeriesMade)
    {
        super(SuitColor, SeriesMade);
    }
    public int NumSeasonsMade()
    {
        int seasons = 0;
        if(SeriesMade == true)
        {
            seasons = Integer.parseInt(JOptionPane.showInputDialog("How Many Seasons?"));
            
        }
        return seasons;
    }
    public String getMotto()
    {
        return "You Have Failed This City";
    }
    public String toString()
    {
        String output = new String("");
        output += super.toString();
        
        return output;
    }
}
