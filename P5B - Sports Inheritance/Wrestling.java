

public class Wrestling extends Sport
{

     //private int courtSize;
     //private String colorOfGear;
     private String team;
     public Wrestling()
     {
         super();
         team = null;
     }
     public Wrestling(int courtSize, String colorOfGear, String team)
     {
         super(courtSize, colorOfGear);
         this.team = team;
     }
     
     public boolean isGranada()
     {
         if(team.equals("Granada"))
              return true;
         else
              return false;

     }
     public String toString()
     {
         String output = new String("");
         output += super.toString();
         
         output += "\nIs granada competing right now? " + isGranada();
         return output;
     }
}
