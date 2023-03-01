
public class Driver
{
    public static void main(){
        //part a
        int[] array1 = {1,3,2,7,3};
        
        System.out.println("Part a) Result: " + P6E.arraySum(array1));
        
        
        //part b
        int[][] array2 = {{1,3,2,7,3},{10,10,4,6,2},{5,3,5,9,6},{7,6,4,2,1}};
        
        int[] returnedArray = P6E.rowSums(array2);
        
        System.out.print("Part b) Result: ");
        for(int i=0; i<returnedArray.length; i++){
            System.out.print(returnedArray[i]+"\t");
        }
        
        System.out.println();
        
        //part c
        int[][] array3 = {{1,1,5,3,4},{12,7,6,1,9},{8,11,10,2,5},{3,2,3,0,6}};
        System.out.print("Part c) Result: ");
        System.out.print(P6E.isDiverse(array2) + "\t" + P6E.isDiverse(array3));
        
    }

}
