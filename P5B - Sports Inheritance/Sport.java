

public class Sport
{
     
     private int courtSize;
     private String colorOfGear;
     public Sport()
     {
         
         courtSize = 0;
         colorOfGear = null;
     }
     public Sport(int courtSize, String colorOfGear)
     {
         
         this.courtSize = courtSize;
         this.colorOfGear = colorOfGear;
     }
     
     
     public String toString()
     {
         String output = new String("");
         
         output += "\nSize Of The Court: " + courtSize;
         output += "\nColor Of Gear: " + colorOfGear;
        
         return output;
     }
}









