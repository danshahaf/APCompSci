import java.util.ArrayList;
import java.util.List;

public class Driver
{
    
    public static void main()
    {
        ArrayList <Orderable> foods = new ArrayList <Orderable>();
        Orderable p1 = new Pizza();
        Orderable p2 = new Pizza(1000, "Cheese");
        Orderable a1 = new Apple();
        Orderable a2 = new Apple(150, "Red");
        Orderable pa1 = new Package();
        Orderable pa2 = new Package(300.73);
        
        foods.add(p1);
        foods.add(p2);
        foods.add(a1);
        foods.add(a2);
        foods.add(pa1);
        foods.add(pa2);
        for(Orderable x : foods)
        {
            System.out.println(x.wasOrdered());
            System.out.println(x);
            System.out.println("--------------------------");
        }
    }
}













