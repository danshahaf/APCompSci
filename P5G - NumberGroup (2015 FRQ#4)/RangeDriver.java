 

public class RangeDriver
   {
   public static void main( )
      {
      Range r1 = new Range( -5, 3 );
      System.out.println( r1.contains( -6 ) );
      System.out.println( r1.contains( 0 ) );           
      System.out.println( r1.contains( 3 ) );
      System.out.println( r1.contains( 4 ) );
      
      } // end method main
       
   } // end class RangeDriver