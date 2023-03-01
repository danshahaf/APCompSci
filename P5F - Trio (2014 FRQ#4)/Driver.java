public class Driver
{
    
   public static void main( )
      {
      Sandwich sandwich = new Sandwich( "Cheeseburger", 10 );
      Salad salad = new Salad( "Spinach Salad" , 10 );
      Drink drink1 = new Drink( "Orange Soda", 15 );
      Drink drink2 = new Drink( "Grape Soda", 15 );
          
      Trio trio1 = new Trio( sandwich, salad, drink1 );
      Trio trio2 = new Trio( sandwich, salad, drink2 );
      
      
      
      
      MenuItem[] orders = {sandwich, salad, drink1, drink2, trio1, trio2};
      
      for(MenuItem currentOrder: orders){
          
          System.out.println( currentOrder.getName() + " for " + currentOrder.getPrice() );
          System.out.println(  );
          
        }
    
    
    } 
       
   } 