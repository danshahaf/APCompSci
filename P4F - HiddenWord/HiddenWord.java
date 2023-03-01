import javax.swing.JOptionPane;

public class HiddenWord
{
    //private boolean guessedItRight = false;
    private String word = "";
    public HiddenWord(String word)
    {
        this.word = word;
    }
    public String checkIt(String guess)
    {
        String currentState = "";
        for(int i = 0; i<word.length(); i++)
        {
            if(word.substring(i,i+1).equals(guess.substring(i,i+1)))
            {
                currentState += word.substring(i,i+1);
            }
            else if(word.indexOf(guess.substring(i,i+1)) != -1)
            {
                currentState += "+";
            }
            else
            {
                currentState += "*";
            }
        }
        return currentState;
    }
}






















