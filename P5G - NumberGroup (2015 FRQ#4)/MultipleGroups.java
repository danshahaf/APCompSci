 

import java.util.List;
import java.util.ArrayList;

public class MultipleGroups implements NumberGroup
   {
   private List<Range> groupList;
   
   public MultipleGroups(){
       groupList = new ArrayList<Range>();
       groupList.add(new Range(5,8));
       groupList.add(new Range(10,12));
       groupList.add(new Range(1,6));
       
    }
        //write the contains method here
    public boolean contains(int num)
    {
        for(Range x: groupList)
        {
            if(x.contains(num) == true)
            {
                return true;
            }
        }
        return false;
    }
    
       
   } // end class MulitpleGroups

