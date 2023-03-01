public class MothershipDriver

   {

   public static void main()

      {

      // Part I - Testing Mothership Construction

      Mothership zeppelin = new Mothership();

      System.out.println( "The results from Part I - Mothership Construction" );

      System.out.println( zeppelin );

      

      

      // Part II - Testing method jettisonDefenders

      //System.out.println( "The number of Aliens jettisoned is: " + 

      //                     zeppelin.jettisonDefenders() );

      System.out.println( "\n\n\n" );

      System.out.println( "The results from Part II - jettisonDefenders" );

      System.out.println( zeppelin.jettisonDefender() );

      System.out.println( zeppelin );

      

      

      // Part III - Testing method consolidate()

      System.out.println( "\n\n\n" );

      zeppelin.consolidate();

      System.out.println( "The results from Part III - consolidate" );

      System.out.println( zeppelin );

      } // end method main

      

   } // end class MothershipDriver
