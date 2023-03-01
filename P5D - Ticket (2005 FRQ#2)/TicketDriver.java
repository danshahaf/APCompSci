 

import java.util.ArrayList;
public class TicketDriver
   {
   public static void main(  )
      {
      Ticket walkup1 = new Walkup();
      Ticket advance1 = new Advance( 14 );            // 14 days
      Ticket stuAdvance1 = new StudentAdvance(  12 ); // 12 days
      
      
      ArrayList<Ticket> ticketHolder = new ArrayList<Ticket>();
      ticketHolder.add( walkup1 );
      ticketHolder.add( advance1 );
      ticketHolder.add( stuAdvance1 );
      
      for( Ticket singleTicket : ticketHolder )
         {
         System.out.println( singleTicket + "\n" );    
         } // end for each 
      } // end method main
   } // end class TicketDriver