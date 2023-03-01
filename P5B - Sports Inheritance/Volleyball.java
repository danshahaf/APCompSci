

public class Volleyball extends Sport
{
     
     //private int courtSize;
     //private String colorOfGear;
     private int heightOfNet; //inches
     public Volleyball()
     {
         super();
         heightOfNet = 0;
     }
     public Volleyball(int courtSize, String colorOfGear, int heightOfNet)
     {
         super(courtSize, colorOfGear);
         this.heightOfNet = heightOfNet;
     }
     
     public int haveToJump()
     {
         return heightOfNet + 6;
     }
     public String toString()
     {
         String output = new String("");
         output += super.toString();
         output += "\nHave to touch height of: " + heightOfNet + " to hit.";
         return output;
     }
}











