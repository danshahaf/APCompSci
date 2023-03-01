

public class SparseArrayEntry
{
    private int row;
    private int col;
    private int value;
    public SparseArrayEntry(int r, int c, int v)
    {
        row = r;
        col = c;
        value = v;
        
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
    public void setCol(int newCol)
    {
        this.col = newCol;
    }
    public int getValue()
    {
        return value;
    }
    
}
