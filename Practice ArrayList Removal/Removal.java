import java.util.ArrayList;
import java.util.List;
public class Removal
{
    private ArrayList<String> fruitList; 
    
    public static void main()
    {
        //this.fruitList = new ArrayList<String>();
        List<String> fruitList = new ArrayList<String>();
        fruitList.add(new String("Apple"));
        fruitList.add(new String("Banana"));
        fruitList.add(new String("Apple"));
        fruitList.add(new String("Banana"));
        fruitList.add(new String("Apple"));
        fruitList.add(new String("Apple"));
        fruitList.add(new String("Banana"));
        fruitList.add(new String("Banana"));
        fruitList.add(new String("Apple"));
        fruitList.add(new String("Banana"));
        fruitList.add(new String("Apple"));
        fruitList.add(new String("Banana"));
        
        
        
        for(String fruit: fruitList)
        {
            System.out.println(fruit);
        }
        System.out.println("Now removing apples....");
        for(int i = 0; i<fruitList.size(); i++)
        {
            if(fruitList.get(i).equals("Apple"))
            {
                fruitList.remove(i);
                i--;
            }
        }
        for(String currentFruit: fruitList)
        {
            System.out.println(currentFruit);
        }
    }
}
