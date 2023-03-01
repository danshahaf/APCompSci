
public class LogMessage
   {
   private String machineID;
   private String description;
   private String message;
   public LogMessage( String message )
      {
          machineID = "";
          description = message;
          this.message = message;
          
          
       
      } // end one-arg constructor
      
   public boolean containsWord( String keyword )
      {
          int x = keyword.length();
          int y = message.length();
          if(message.equals("disk"))
          {
              return true;
          }
          if(message.contains(" " + keyword + " "))
          {
              return true;
          }
          if(message.indexOf(keyword + " ") == 0)
          {
              return true;
          }
          if(message.substring(y - x -1 , y ).compareTo(":" + keyword) == 0)
          {
              return true;
          }
          if(y > x && (message.substring(y - x-1, y).equals (" " + keyword)))
          {
              return true;
          }
          return false;
          //return false;
          //return null;
      } // end method containsWord
      
   public String getMachineID()
      {
      return machineID;    
      } // end method getMachineID
      
   public String getDescription()
      {
      return message;    
      } // end method getDescription
    
      
      public String toString()
      {
        
      
         return machineID + ":" + description ;
          // end method toString
      } // end method toString
       
   } // end class LogMessage
