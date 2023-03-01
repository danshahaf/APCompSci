import java.util.ArrayList;

public class Family
{
    private ArrayList<Relative> family;
    public Family()
    {
        this.family = new ArrayList<Relative>();
        Relative r1 = new Relative("Dad", 54);
        Relative r2 = new Relative("Mom", 46);
        Relative r3 = new Relative("Brother", 14);
        Relative r4 = new Relative("Brother", 10);
        Relative r5 = new Relative("Sister", 6);
        Relative r6 = new Relative("Dog", 7);
        family.add(r1);
        family.add(r2);
        family.add(r3);
        family.add(r4);
        family.add(r5);
        family.add(r6);
    }
    public void sortByAge()
    {
        for(int i=0; i<family.size()-1; i++)
        {
            if(family.get(i).getAge() > family.get(i+1).getAge())
            {
                family.add(family.get(i));
                family.remove(i);
                /*if(family.get(i) == null)
                {
                    family(i) = family.get(i+1);
                    family.get(i+1) = null;
                }*/
                i--;
            }
        }
    }
    public String toString()
    {
        String output = new String();
        for(int i = 0; i<family.size(); i++)
        {
            output += family.get(i).getRelation() + " is " + family.get(i).getAge() + " years old\n";
        }
        return output;
    }
}










