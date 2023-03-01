import javax.swing.JOptionPane;


public class Check
{
    public static void main()
    {
        String un = JOptionPane.showInputDialog("Please choose a username");
        String pw = JOptionPane.showInputDialog("Please choose a password");
        
        //Password check
        String ucheck = JOptionPane.showInputDialog("Please enter your username");
        String pcheck = JOptionPane.showInputDialog("Please enter your password");
        
        if (un.equals(ucheck) && pw.equals(pcheck))
        {           
            String[] artistArray= new String[4];
            artistArray[0] = "TwentyOnePilots";
            artistArray[1] = "Young the Giant";
            artistArray[2] = "Hillsong Y&F";
            artistArray[3] = null; //"Branches";
            
            System.out.println("Searching for Hillsong Y&F");
            
            
            for(int i=0; i<artistArray.length; i++)
            {
                if(artistArray[i]==null)
                {
                    System.out.println("Check #" + (i+1)+ " is empty(null)");
                }
                else if(artistArray[i].equals("Hillsong Y&F"))
                {
                    System.out.println("Check #"+(i+1)+" was " + artistArray[i] + " and found Hillsong Y&F");
                }
                else
                {
                    System.out.println("Check #" + (i+1)+ " was " + artistArray[i] + " and did not find Hillsong Y&F");
                }
            }
            
            String favArtist = JOptionPane.showInputDialog("What's your favorite artist?");
            String myFav = "TwentyOnePilots";
            if(favArtist.equals(myFav))
            {
                System.out.println("We have the same favorite artist");
            }
            else
            {
                System.out.println("We can not be friends");
            }
            //  Use a for loop to traverse(go through) the array to attempt find “Michael Jackson”. 
            //Print a statement for each corresponding element in the array stating whether or not 
            //you found Michael and the current element in the array, starting at 1.
        }
        
        
        
        else
        {
            try 
            {
                // thread to sleep for x milliseconds
                System.out.println("Wrong username or password");
                Thread.sleep(3000);
                System.exit(0); 
            }
            catch(Exception e)
            {
            }
        }
    }
}
        