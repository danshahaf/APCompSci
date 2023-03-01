import java.util.ArrayList;

public class CardCollection
{
    private ArrayList<BaseballCard> cardList;
    public CardCollection()
    {
        this.cardList = new ArrayList<BaseballCard>();
        //method #1:
        //creating the class
        BaseballCard card1 = new BaseballCard("Babe Ruth", 250.75);
        BaseballCard card2 = new BaseballCard("Mickey Mantle", 150.75);
        BaseballCard card3 = new BaseballCard("Willie Mays", 200);
        //then adding it to the ArrayList
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        //Mathod #2:
        //cardList.add(new BaseballCard("Babe Ruth", 250.75));
        
        
        
            
        
    }
    //For each Loop
    public double getAverage()
    {
       double total = 0.0;
       for(BaseballCard x: cardList)
       {
           total += x.getValue();
           
       }
       return total/cardList.size();
    }
    //for loop
    public double getAverageTwo()
    {
       double total = 0.0;
       for(int i = 0; i <cardList.size(); i++)
       {
           total += cardList.get(i).getValue();
           
       }
       return total/ cardList.size();
    }
    public String toString()
    {
        String output = new String("");
        for(BaseballCard x: cardList)
       {
           output += x + "\n" ;
           
       }
        return output;
    }
}











