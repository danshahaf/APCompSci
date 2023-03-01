import java.util.List;
import java.util.ArrayList;

public class SeatingChart
{
    private Student[][] seats;
    public SeatingChart(List<Student> studentList, int rows, int cols)
    {
        // to be completed in part A
        int counter = 0;
        seats = new Student[rows][cols];
        for(int c = 0; c<seats[0].length; c++)
        {
            for(int r = 0; r<seats.length; r++)
            {
                if(counter<studentList.size())
                {
                    seats[r][c] = studentList.get(counter);
                    counter++;
                }
                else
                {
                    seats[r][c] = null;
                }
                
            }
        }
    }
    public int removeAbsentStudents(int allowedAbsences)
    {
        //to be completed in part B
        int number = 0;
        for(int r = 0; r<seats.length; r++)
        {
            for(int c = 0;c<seats[0].length;c++)
            {
                if(seats[r][c] != null)
                {
                    if(seats[r][c].getAbsenceCount() > allowedAbsences)
                    {
                        seats[r][c] = null;
                        number++;
                    }
                }
            }
        }
        return number;
    }
    public String toString()
    {
        String output = new String("");
        for(int r = 0; r<seats.length; r++)
        {
            for(int c = 0 ; c<seats[0].length; c++)
            {
                if(seats[r][c] == null)
                {
                    output += "null\t\t";
                }
                else
                {
                    output += seats[r][c].getName() + ":" + seats[r][c].getAbsenceCount() + "\t\t";
                }
            }
            output += "\n";
        }
        
        return output;
    }
}









