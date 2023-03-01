import java.util.ArrayList;
import java.util.List;

public class Driver2
{
    private ArrayList<Parent> family;
    public static void main()
    {
        ArrayList<Parent> family = new ArrayList<Parent>();
        family.add(new Grandchild(1,"black"));
        family.add(new Son(9));
        family.add(new Daughter(12));
        
        for(Parent x: family)
        {
            System.out.println(x.getSaying());
            System.out.println("---------------------------");
        }
    }
}
