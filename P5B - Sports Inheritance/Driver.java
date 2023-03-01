import java.util.ArrayList;
import java.util.List;

public class Driver
{
    public static void main()
    {
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(new Volleyball(162, "White, blue and red", 76));
        sports.add(new Basketball(435, "Orange", 8));
        sports.add(new Wrestling (146, "Black and white", "Granada"));
        
        
        for( Sport x: sports)
        {
            System.out.println(x.toString());
            System.out.println("---------------------------------------------------");
        }
    }
}
