import java.util.ArrayList;
import java.util.List;

public class Driver
{
    //ArrayList <Superhero> heroes = new ArrayList<Superhero>();
    public static void main()
    {
        ArrayList <Superhero> heroes = new ArrayList<Superhero>();
        heroes.add(new TheFlash(1000, "Red", true));
        heroes.add(new Arrow("Green", true));
        heroes.add(new Shahaf("Blue", false/*not yet*/));
        System.out.println("MOTTOS:");
        for(int i = 0; i<heroes.size(); i++)
        {
            System.out.println(heroes.get(i).getMotto());
        }
        System.out.println("***********************************");
        for(Superhero x: heroes)
        {
            System.out.println(x.toString());
            System.out.println("----------------------");
        }
    }
}
