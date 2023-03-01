

public class Car
{
     private double MPG;
     private boolean isInStock;
     private String maker;
     public Car()
     {
         MPG = 0.0;
         isInStock = false;
         maker = "";
     }
     public Car(double MPG, boolean isInStock, String maker)
     {
         this.MPG = MPG;
         this.isInStock = isInStock;
         this.maker = maker;
     }
     public double getMPG()
     {
         return MPG;
     }
     public void setMPG(double MPG)
     {
         this.MPG = MPG;
     }
}
