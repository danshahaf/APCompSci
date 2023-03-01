 import java.util.ArrayList;
 import java.util.List;

public class RandomStringChooserDriver
{
     public static void main(  )
     {
          String[] wordArray = new String[] {"wheels", "on", "the", "bus"};
      
     
          RandomStringChooser sChooser = new RandomStringChooser( wordArray );
            
          for( int k = 0;k < 6; k++ )
          {
              System.out.print( sChooser.getNext() + " " );    
          } 
          
     }  
       
} 