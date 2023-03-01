

public class Stringfun
{
    public static void main()
    {
        String phrase = new String("I like pie");
        System.out.println(phrase);
        
        System.out.println(phrase.length());
        
        System.out.println(phrase.substring(0));
        System.out.println(phrase.substring(4));
        System.out.println(phrase.substring(9));
        System.out.println(phrase.substring(0,1));
        System.out.println(phrase.substring(2,6));
        
        for(int i=0;i<phrase.length();i++)
        {
            System.out.println(phrase.substring(0, (i+1)));
        }
        
        for(int i=0;i<phrase.length();i++)
        {
            System.out.println(phrase.substring(0, (i+1)));
            //phrase += phrase.substring(i, i+1);
        }
        
        System.out.println("indexOf('cake') " + phrase.indexOf("cake"));
        System.out.println("indexOf('ie') " + phrase.indexOf("ie"));
        System.out.println("indexOf('i') " + phrase.indexOf("i"));
        System.out.println("indexOf('piece') " + phrase.indexOf("piece"));
        
        String word1 = new String("No");
        String word2 = new String("Homeowork");
        String word3 = new String(""); 
        word3 = word1 + " " + word2;
        System.out.println(word3);
        
        String word4 = new String("");
        for(int i = word3.length(); i >4; i--)
        {
            word4 += word3.substring(i-1,i);
        }
        System.out.println(word4);
    }
    
}


























