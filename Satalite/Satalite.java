import javax.swing.JOptionPane;
public class Satalite
{
    public static void main()
    {
        int numSatellite = Integer.parseInt(JOptionPane.showInputDialog("Number of satellites?"));
        int[] satellite = new int [numSatellite];
        for(int i=0;i<(numSatellite);i++)
        {
            satellite[i]= (i+1);
        }
        
        int[] satelliteAlt = new int [numSatellite];
        for(int i=0;i<(numSatellite);i++)
        {
            satelliteAlt[i] = (int)(-5000 + Math.random()*205001);
        }
        
        String[] orbitLocation = new String [numSatellite];
        for(int i=0;i<(numSatellite);i++)
        {
            if(satelliteAlt[i]<=0) orbitLocation[i]= "Crash Landing";
            else if(satelliteAlt[i] <10000) orbitLocation[i]= "Not good";
            else if(satelliteAlt[i] <50000) orbitLocation[i]= "Low earth orbit";
            else if(satelliteAlt[i] <150000) orbitLocation[i]= "High earth orbit";
            else orbitLocation[i]= "You're out there orbit";
        }
        
        System.out.println("Satellite# \tSatelliteAltitude \tOrbit Location");
        
        for(int i=0;i<(numSatellite);i++)
        {
            System.out.println(satellite[i]+" \t\t"+satelliteAlt[i]+ " \t\t\t"+orbitLocation[i]);
        }
    }
}