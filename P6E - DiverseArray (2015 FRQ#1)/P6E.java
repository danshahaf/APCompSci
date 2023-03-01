
public class P6E
{
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum+= arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D)
    {
        int counter = 0;
        int sumUpRow = 0;
        int[] sum = new int[arr2D.length];
        for(int r = 0; r<arr2D.length;r++)
        {
            for(int c = 0; c<arr2D[0].length ;c++)
            {
                sumUpRow += arr2D[r][c];
            }
            sum[counter] = sumUpRow;
            sumUpRow = 0;
            counter++;
        }
        return sum;
    }
    public static boolean isDiverse(int[][] arr2D)
    {
        int counter = 0;
        int sumUpRow = 0;
        int[] sum = new int[arr2D.length];
        for(int r = 0; r<arr2D.length;r++)
        {
            for(int c = 0; c<arr2D[0].length ;c++)
            {
                sumUpRow += arr2D[r][c];
            }
            sum[counter] = sumUpRow;
            sumUpRow = 0;
            counter++;
        }
        
        for(int i = 0; i < sum.length-1; i++)
        {
            for(int j = i+1; j <sum.length; j++)
            {
                if(sum[i] == sum[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}