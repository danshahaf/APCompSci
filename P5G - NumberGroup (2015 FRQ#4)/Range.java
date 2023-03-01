 import java.util.ArrayList;
 import java.util.List;

public  class Range implements NumberGroup
   {
       private int min;
       private int max;
       private ArrayList<Integer> range;
       
       public Range()
       {
           min = 0;
           max = 0;
           ArrayList<Integer> range = new ArrayList<Integer>();
       }
       public Range(int min, int max)
       {
           this.min = min;
           this.max = max;
           /*ArrayList<Integer> range = new ArrayList<Integer>();
           for (int i = min; i<=max; i++)
           {
               range.add(i);
           }*/
       }
       public boolean contains(int num)
       {
//            ArrayList<Integer> range = new ArrayList<Integer>();
//            //populating the arraylist
//            for (int i = min; i<=max; i++)
//            {
//                range.add(i);
//            }
//            //checking for num
//            for(int i = 0; i<range.size(); i++)
//            {
//                if(range.get(i) == num)
//                {
//                    return true;
//                }
//            }
//            return false;
return num <= max && num>= min;
       }
   } // end class Range