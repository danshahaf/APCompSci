

public class Grid
{
    public static void main()
    {
        //declare a 2 dimansional array called grid that holds ints
        int[][] grid = new int[3][4]; //3 rows and 4 columns
        for(int r=0; r< grid.length; r++) //the outer loop goes through the rows
        {
            //grid.length will give us the number of rows in a 2D array
            for(int c = 0; c < grid[0].length; c++) // the inner loops goes throught each column
            {
                //grid[0].length will go trough each item in the row (column) in a 2D array
                grid[r][c] = r + c;
                //fills the 2D array  in row - najor order, which means it fills across rows first
            }
        }
        //printing
        for(int r=0; r< grid.length; r++) 
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                System.out.print(grid[r][c] + "\t");
            }
            System.out.println("");
        }
        System.out.println("------------------------------\n------------------------------");
        
        
        
        
        int[][] grid2 = new int[5][5];
        boolean check = false;
        ///random filled 2D Array
        for(int r=0; r< grid2.length; r++) 
        { 
            for(int c = 0; c < grid2[0].length; c++)
            {
                grid2[r][c] = (int)(Math.random() * 10);//filling with random ints
                System.out.print(grid2[r][c] + "\t"); //printing rows
            }
            System.out.println("");//printing columns
        }
        System.out.println("Cells that contain 7:");
        for(int r=0; r< grid2.length; r++) 
        {
            for(int c = 0; c < grid2[0].length; c++)
            {
                if(grid2[r][c] == 7)//checking if 7
                {
                    System.out.println("Cell " + r + ", " + c);
                    check = true;
                }
            }
        }
        if(!check)
        {
            System.out.println("No 7's are found");
        }
    }
}
