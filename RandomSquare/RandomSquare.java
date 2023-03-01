import javax.swing.JOptionPane;
public class RandomSquare
{
    public static void main()
    {
        for(int i=1; i<=10; i++)
        {
            int squareRoot = i*i;
            int rand = (int)(i + Math.random()*(squareRoot-i+1));
            if (rand == squareRoot && rand ==i)
            {
                System.out.println(i + "\t" + squareRoot + "\t" + rand + "\t The random value is equal to the square root and the index");
            }
            else if (rand == i)
            {
                System.out.println(i + "\t" + squareRoot + "\t" + rand + "\t The random value is equal to the index");
            }
            else if (rand == squareRoot)
            {
                System.out.println(i + "\t" + squareRoot + "\t" + rand + "\t The random value is equal to the square root of the index");
            }
            else
            {
                System.out.println(i + "\t" + squareRoot + "\t" + rand);
            }
        }
        
        String[] movieArray= new String[3];
        movieArray[0]= "The Office";
        movieArray[1]= "Parks and Rec";
        movieArray[2]= "Hawaii Five-0";
        for(int n=0; n<movieArray.length; n++)
        {
            System.out.println(movieArray[n]);
        }
        System.out.println("\n");
        
        String[] songArray= new String[3];
        songArray[0]= "Trees";
        songArray[1]= "Holding on to you";
        songArray[2]= "Car radio";
        int n=0;
        
        while(n<3)
        {
            if(n<(songArray.length-1))
            {
                System.out.print(songArray[n]+", ");
                n++;
            }
            else
            {
                System.out.print(songArray[n]);
                n++;
            }
        }
    }
}