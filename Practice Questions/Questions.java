import java.util.ArrayList;
public class Questions
{
    public static void main()
    {
        //String[] myArray = new String[]{"Mike", "Bobby", "Tina"};
        /*for( int i = 0; i<myArray.length; i++)
        {
            myArray[i] += "howdey";
        }*/
        /*int[] myArray = new int []{5,10,15,25};
        
        for(int x:myArray)
        {
            x += 100;
        }
        for(int i = 0;i<myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }*/
        ArrayList<String> names = new ArrayList<String>();
        names.add("Justin");
        names.add("Shahaf");
        names.add("Soma");
        names.add("nakil");
        
        for(int i = 0; i< names.size(); i++)
        {
            names.set(i, names.get(i) + " is a savage");
        }

        for(int i = 0; i <names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        
    }
}
