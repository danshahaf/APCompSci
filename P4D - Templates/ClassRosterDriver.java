
public class ClassRosterDriver
   {
   public static void main( String[] args )
      {
      // 1. Creating and printing ClassRoster    
      ClassRoster myPeriod1 = new ClassRoster( "AP Computer Science" );
      System.out.println( "Class Roster:\n" + myPeriod1 );

      // 2. Testing studentWithMaxGPA
      System.out.println( "Student with the max GPA is: " + myPeriod1.studentWithMaxGPA() );
      System.out.println( "\n\n" );
      
      // 3. Testing dropStudent
      System.out.println( "The number of student(s) dropped is" + myPeriod1.dropStudent( 3 ) );
      System.out.println( "Class Roster:\n" + myPeriod1 );
      System.out.println( "\n\n" );

      //4 . Testing addStudent
      myPeriod1.addStudent( new Student( "Super", "Woman", 12, 6, 6, 6, 6, 6) );
      System.out.println( "Class Roster:\n" + myPeriod1 );
                          
      System.out.println( "\n\n" );

          
      } // end method main
      
   } // end class ClassRosterDriver

