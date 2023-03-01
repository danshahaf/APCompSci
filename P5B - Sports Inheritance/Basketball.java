

public class Basketball extends Sport
{
     //private int courtSize;
     //private String colorOfGear;
     private double sizeOfBall; //in inches
     public Basketball()
     {
         super();
         sizeOfBall = 0.0;
     }
     public Basketball(int courtSize, String colorOfGear, double sizeOfBall)
     {
         super(courtSize, colorOfGear);
         this.sizeOfBall = sizeOfBall;
     }
     
     public double Volume()
     {
         double volume = ((0.5 * sizeOfBall) * (0.5 * sizeOfBall)) * 3.14;
         return volume;
     }
     public String toString()
     {
         String output = new String("");
         output += super.toString();
         output += "\nVolume of the Ball: " + Volume();
         return output;
     }
}













