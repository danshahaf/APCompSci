import javax.swing.JOptionPane;

public class HiddenWordDriver
{

    public static void main()
    {
        boolean gotIt = false;
        String guess = "";
        String word = "HARPS";
        int length = word.length();
        HiddenWord word1 = new HiddenWord(word);
        while(gotIt == false)
        {
            guess = JOptionPane.showInputDialog("guess a word with " + length + " LETTERS");
            if(guess.length() != 5)
            {
                System.out.println("GUESS HAS TO BE " + length + "letters");
            }
            else
            {
                if(word1.checkIt(guess).equals(word))
                {
                    gotIt = true;
                }
                else
                {
                    System.out.println("Guessed: "+ guess + " \t\tResult: " + word1.checkIt(guess));
                }
            }
        }
        System.out.println("You guessed the word! \t" + word);
    }
}
