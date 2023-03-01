public class Arrays
{
    public static void main()
    {
        //16,17,17,18,16,17
        //the first index in the array is named ageArray
        
        int[] ageArray= {17,17,18,15,16,17};
        
        System.out.println("ageArray has a length of " + ageArray.length);
        for (int i=0; i<ageArray.length; i++)
        {
            System.out.println("The current age in the array is " + ageArray[i]);
        }
        for (int i=0; i<ageArray.length; i++)
        {
            ageArray[i]+=5;
            System.out.println("In five years the ages will be " + ageArray[i]);
        }
        
        //initializing an array of size 6
        int[] newArray = new int[6];
        for (int i =0; i<newArray.length; i++)
        {
            newArray[i]=i*8;
            System.out.println(newArray[i]);
        }
    }    
}