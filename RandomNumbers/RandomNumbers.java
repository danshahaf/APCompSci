public class RandomNumbers
{
    public static void main()
    {
        int total=0;
        for(int i = 0; i < 10; i++)
        {
            //Math.random() generates a double from 0 to 0.9999
            //(int) trunkates (chops of decimals)
            int dice = (int)(6*Math.random()+1);
            total+=dice;//accumulater
            
            System.out.println((i+1) + ") \t" + dice + "\t" + total);            
        }
    }
}