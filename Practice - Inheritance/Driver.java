

public class Driver
{
    //a static method can be calles without having an object
    public static void main()
    {
        Math[] classArray = new Math[3];
        classArray[0] = new Geometry();
        classArray[1] = new Geometry("Willis", 30, true);
        classArray[2] = new Algebra1("Hahn" , 40);
        
        System.out.println("*****PRINTING toString() METHOD*****\n\n");
        for(Math x: classArray)
        {
            System.out.println(x);
        }
        
        
        System.out.println("\n\n*****PRINTING checkEnrollment() METHOD*****\n\n");
        for(int i=0; i<classArray.length; i++)
        {
            if(classArray[i] != null)
            {
                System.out.println("In class #" + (i+1) + ": \t" + classArray[i].checkEnrollment());
            }
            
        }
    }
}
