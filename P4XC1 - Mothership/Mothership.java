import java.util.ArrayList;

public class Mothership
{
    private Alien[] cockpitCrew = new Alien[5];
    private ArrayList<Alien> flightCrew = new ArrayList<Alien>();
    public Mothership()
    {
        ///creating new aliens for the array cockpitCrew and adding them to the array
        Alien a1 = new Alien(100,"Attacker");
        Alien a2 = new Alien(250,"Defender");
        Alien a3 = new Alien(300,"Defender");
        Alien a4 = new Alien(350,"Attacker");
        Alien a5 = new Alien(50,"Defender");
        cockpitCrew[0] = a1;
        cockpitCrew[1] = a2;
        cockpitCrew[2] = a3;
        cockpitCrew[3] = a4;
        cockpitCrew[4] = a5;
        ///creating new aliens for the arraylist flightCrew and adding the, to the array
        Alien a6 = new Alien(700,"Attacker");
        Alien a7 = new Alien(250,"Defender");
        Alien a8 = new Alien(350,"Defender");
        Alien a9 = new Alien(500,"Attacker");
        Alien a10 = new Alien(100,"Defender");
        flightCrew.add(a6);
        flightCrew.add(a7);
        flightCrew.add(a8);
        flightCrew.add(a9);
        flightCrew.add(a10);
    }
    public String toString()
    {
        String output = new String();
        output += "Members of the cockpit crew:\n " ;
        
        for(int i=0; i<cockpitCrew.length; i++)
        {
            if(cockpitCrew[i] !=  null)
            {
                output += "Alien" + (i+1) + ": firepower: " + cockpitCrew[i].getFirepower() + ", type: " + cockpitCrew[i].getPosition() + "\n";
            }
            else
            {
                output += "null \n";
            }//output += "Alien" + (i+1) + ": firepower: " + cockpitCrew[i].getFirepower() + ", type: " + cockpitCrew[i].getPosition() + "\n";
        }
        output += "Members of the flight crew: \n" ;
        for(int i=0; i<flightCrew.size(); i++)
        {
            output += "Alien" + (i+1) + ": firepower: " + flightCrew.get(i).getFirepower() + ", type: " + flightCrew.get(i).getPosition() + "\n";
        }
        return output;
    }
    public int jettisonDefender()
    {
        int counter = 0;
        for(int i=0; i<cockpitCrew.length; i++)
        {
            if(cockpitCrew[i].getFirepower() > 200 && cockpitCrew[i].getPosition().equals("Defender"))
            {
                cockpitCrew[i] = null;
                counter ++;
            }
        }
        for(int i=0; i<flightCrew.size(); i++)
        {
            if(flightCrew.get(i).getFirepower() > 200 && flightCrew.get(i).getPosition().equals("Defender"))
            {
                flightCrew.remove(i);
                i--;
                counter++;
            }
        }
        return counter;
    }
    public void consolidate()
    {
        Alien[] temporary = new Alien[5];
        
        for(int i=cockpitCrew.length-1; i>0;i--)
        {
            if(cockpitCrew[i] == null)
            {
                for (int b = i ; b<cockpitCrew.length-1; b++)
                {
                    cockpitCrew[b] = cockpitCrew[b+1];
                    //cockpitCrew[cockpitCrew.length-1] = null;
                    
                }
                cockpitCrew[cockpitCrew.length-1] = null;
            }
            
        }
        
    }
}
























