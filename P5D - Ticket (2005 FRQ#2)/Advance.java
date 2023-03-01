 

public class Advance extends Ticket
   {
       private int days;
       private double price;
       public Advance(int days)
       {
           super();
           this.days = days;
           
       }
       public double getPrice()
       {
           if(days > 9)
           {
               price = 30.0;
           }
           else
           {
               price = 40.0;
           }
           return price;
       }
       public String toString()
       {
           String output = new String("");
           output += "\n" + super.toString();
           return output;
       }
       
   } // end class Advance