 

public class StudentAdvance extends Advance
   {
       public int days;
       public double price;
       public StudentAdvance(int days)
       {
           super(days);
       }
       public double getPrice()
       {
           price = super.getPrice() / 2;
           return price;
       }
       public String toString()
       {
           String output = new String();
           output += super.toString();
           output += "\nStudent ID is needed";
           return output;
           
            
       }
   }
