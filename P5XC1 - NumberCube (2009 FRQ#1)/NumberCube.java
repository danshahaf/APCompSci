

public class NumberCube
{
    private int[] numbers;
    private int range;
    public NumberCube()
    {
        range = 0;
    }
    public NumberCube(int range)
    {
        //int[] numberCube = new int[]{};
        this.range = range;
    }
    public int getRange()
    {
        return this.range;
    }
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] numberCube = new int[numTosses];
        for(int i=0; i<numberCube.length; i++)
        {
            numberCube[i] = (int)(Math.random() * cube.getRange());
        }
        return numberCube;
    }
    public static int getLongestRun(int[] values)
    {
        int counter = 0;
        int counter2 = 0;
        int numRun = 0;
        for(int i = 0; i<values.length-1; i++)
        {
            if(values[i] == values[i+1])//run exists
            {
                for(int b = i; b<values.length; b++)
                {
                    if(values[b] == values[i])
                    {
                        counter++;
                    }
                    else
                    {
                        counter2 = counter;
                        if(counter > counter2)
                        {
                            numRun = i;
                        }
                        counter = 0;
                    }
                }
            }
            else//no runs
            {
                return -1;
            }
        }
        return numRun;
    }
    /*public String toString()
    {
        String output = new String();
        output += "Range of the Cube is: 1 to " + range;
        output += "\nTosses results:\n" + getCubeTosses(;
        
        output += "
        return output;
        
    }*/
}









