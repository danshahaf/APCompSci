import java.util.ArrayList;
public class ClassRoster
   {
   private ArrayList<Student> studentList = new ArrayList<Student>();
   private String courseName;
   public ClassRoster( String initialCourseName )
      {
          courseName = initialCourseName;
      studentList.add( new Student( "Super", "Man", 12, 1, 1, 1, 1, 1 ) );
      studentList.add( new Student( "Silver", "Surfer", 11, 2, 200, 2, 2, 2 ) );
      studentList.add( new Student( "Captain", "America", 12, 3, 3, 3, 3, 3 ) );
      studentList.add( new Student( "Bat", "Man", 11, 4, 4, 4, 4, 4 ) );
      studentList.add( new Student( "Black", "Panther", 11, 5, 5, 5, 5, 5 ) );
    
          
      } // end zero-arg constructor
      
   public String studentWithMaxGPA()
      {
      double highGPA = 0.0;
      String name = "";
      for(int i = 0; i<studentList.size(); i++)
      {
          if(studentList.get(i).calcGPA() > highGPA)
          {
              highGPA = studentList.get(i).calcGPA();
              name = studentList.get(i).getFirstName() + studentList.get(i).getLastName();
          }
      }
          
      
      return name;
      } // end method studentWithMaxGPA 
       
   public int dropStudent( int minGradeLevel )
      {
          int counter = 0;
      for(int i = 0; i <studentList.size(); i ++)
          {
              if(studentList.get(i).calcGPA() < minGradeLevel)
              {
                  studentList.remove(i);
                  i--;
                  counter++;
              }
          }
      return counter;
      } // end method dropStudent
      
   public void addStudent( Student newStudent )
      {
          //Student newStudent = new Student();
          studentList.add(newStudent);
          //studentList.add( new Student( "Shahaf", "Dan", 11, 2.2, 3.3, 4.4, 3.2, 3.7 ) );
      } // end method addStudent
       
      
   public String toString()
      {
      String output = new String();
       output += "Class: " + courseName + "\n";
       
       for( int index = 0; index < studentList.size(); index++ )
          {
          output += studentList.get( index ) + "\n";  
          } // end for
      return output;
      } // end method toString
   } // end ClassRoster

