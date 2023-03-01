import java.util.ArrayList;
import java.util.List;

public class Driver
{
    
    public static void main()
    {
        List<Student> roster = new ArrayList<Student>();
        roster.add(new Student("Karen",3));
       roster.add(new Student("Liz",1));
       roster.add(new Student("Paul",4));
       roster.add(new Student("Larry",1));
       roster.add(new Student("Henry",5));
       roster.add(new Student("Renee",9));
       roster.add(new Student("Glen",2));
       roster.add(new Student("Fran",6));
       roster.add(new Student("David",1));
       roster.add(new Student("Danny",3));
       
       SeatingChart myChart= new SeatingChart(roster,3,4);
       
       System.out.println(myChart);
       
       //myChart.removeAbsentStudents(4);
       System.out.println("\n" + myChart.removeAbsentStudents(4) + "  Students were Removed:\n");
       System.out.println(myChart);
       

    }
    
}
