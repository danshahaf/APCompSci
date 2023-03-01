 

public abstract class Ticket
   {
   private static int serialNumber = 2; // unique ticket id number   
   
   public Ticket()
      {
      serialNumber = getNextSerialNumber();
      } // end zero-argument constructor Ticket()
      
   // returns the price for this ticket
   public abstract double getPrice();
   
   // returns a new unique serial number
   private static int getNextSerialNumber()
      {
      serialNumber++;
      return serialNumber;
      } // end method getNextSerialNumber

   
   // returns a string with information about the ticket
   public String toString()
      {
      return "Number: " + getNextSerialNumber() + "\nPrice: $" + getPrice();  
      } // end method toString
      
   } // end abstract class Ticket