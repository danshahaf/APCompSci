

public class Word
{
    private String newWord;
    private String[] letters;
    public static String scrambledWord(String word)
    {
        String letters[] = new String[word.length()];
        for(int i = 1; i<letters.length; i++)
        {
            letters[i] = word.substring(i-1,i);
        }
        String newWord = "";
        for(int i = 1; i<letters.length; i++)
        {
            if(letters[i-1].equals("A"))
            {
                if(!(letters[i].equals("A")))
                {
                    letters[i-1] = letters[i];
                    letters[i] = "A";
                    i++;
                }
            }
        }
        for(int i = 0; i < letters.length; i ++)
        {
            newWord += letters[i];
        }
        return newWord;
    }
}
