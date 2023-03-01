

public class Rectangular
{
    public static void main()
    {
        int filler = 1;
        int counter = 0;
        int recArraySum = 0;
        int rowSum = 0;
        int colNum = 0;
        int colSum = 0;
        int [][] recArray = new int [3][5];
        //populating the 2D array
        for(int r = 0; r<recArray.length; r++)
        {
            for(int c = 0; c<recArray[0].length; c++)
            {
                recArray[r][c] = filler;//(int)(1 + Math.random() * 15);
                filler++;
            }
        }
        
        for(int[] r: recArray)
        {
            for(int c: r)
            {
                recArraySum += c;
                System.out.print(c + "\t");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------");
        System.out.println("Total sum of all 15 elements: " + recArraySum);
        
        System.out.println("--------------------------------------");
        for(int[] r: recArray)
        {
            for(int c: r)
            {
                recArraySum += c;
                rowSum += c;
            }
            System.out.println ("Row #" + (counter+1) + " has a sum of " + rowSum);
            rowSum = 0;
            counter ++;
        }
        System.out.println("--------------------------------------");
        for(int r = 0; r<recArray[0].length; r++)
        { 
            for(int c = 0; c<recArray.length; c++)
            {
                if(r == colNum)
                {
                    colSum += recArray[c][r];
                }
            }
            System.out.println("Column #" + (colNum+1) + " has a sum of: " + colSum);
            colSum = 0;
            colNum++;
        }
        System.out.println("--------------------------------------");
        filler = 1;
        for(int c = 0; c<recArray[0].length; c++)
        {
            for(int r = 0; r<recArray.length; r++)
            {
                recArray[r][c] = filler;//(int)(1 + Math.random() * 15);
                filler++;
            }
        }
         for(int[] r: recArray)
        {
            for(int c: r)
            {
                
                System.out.print(c + "\t");
            }
            System.out.println("");
        }
    }
}
