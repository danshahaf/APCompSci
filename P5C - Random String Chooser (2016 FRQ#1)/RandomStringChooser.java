 import java.util.List;
 import java.util.ArrayList;

public class RandomStringChooser
{
       private ArrayList <String> parts = new ArrayList <String>();
       //private ArrayList <String> letters = new ArrayList <String>();
       String[] wordList;
       public RandomStringChooser(String[] wordList)
       {
           this.wordList = wordList;
           for(int i = 0; i<wordList.length; i++)
           {
               parts.add(wordList[i]);
           }
       }
       public String getNext()
       {
           
            String word = new String();
           
           
            
            if(parts.size() == 0)
            {
                return "NONE";
            }
            else
            {
                int rand = (int)(Math.random() * parts.size());
                word =  parts.get(rand);
                parts.remove(rand);
            }
            return word;
           
       }
       public String toString()
       {
          String output = new String();
       
          for( String word : wordList )
          {
              output += word + ", ";    
          } 
         
          return output;
       } 
} 
