import java.util.ArrayList;

public class Colleges
{
    public static void main()
     {
         ArrayList<String> colleges = new ArrayList<String>();
         colleges.add("Berkeley");
         colleges.add("UCLA");
         colleges.add("State Universiity San Jose");
         colleges.add("UC Santa Barbara");
         for(int i = 0; i<colleges.size(); i++)
         {
             if(colleges.get(i) == null)
             {
                 System.out.println("null");
             }
             else
             {
                 System.out.println(colleges.get(i));
             }
         }
         System.out.println("-------------------");
         //for each loop to traverse through college ArrayList
         for(String currentCollege: colleges)
         {
             System.out.println(currentCollege);
         }
         System.out.println("-------------------");
         colleges.remove(1); // removing item number 1 from the ArrayList.
         colleges.add(1, "Santa Clara");//adding an item in a specific spot in the ArrayList
         
         //Reprinting the ArrayList colleges
         for(String currentCollege: colleges)
         {
             System.out.println(currentCollege);
         }
         System.out.println("-------------------");
         //concantenating to each college
         for(int i=0; i<colleges.size(); i ++)
         {
             colleges.set(i, colleges.get(i) + " is a great college!");
             System.out.println(colleges.get(i));
         }
     }
}
