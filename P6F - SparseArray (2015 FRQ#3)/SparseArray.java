import java.util.List;
import java.util.ArrayList;

public class SparseArray
{
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;
    public SparseArray()
    {
        entries = new ArrayList<SparseArrayEntry>();
    }
    public int getNumRows()
    {
        return numRows;
    }
    public int getNumCols()
    {
        return numCols;
    }
    public int getValueAt(int row, int col)
    {
        // to be completed in part A
        int value = 0;
        for(SparseArrayEntry entry: entries)
        {
            if(entry.getRow() == row)
            {
                if(entry.getCol() == col)
                {
                    value = entry.getValue();
                }
            }
        }
        return value;
    }
    public void addEntry(SparseArrayEntry entry)
    {
        entries.add(entry);
    }
    public void removeColumn(int col)
    {
        // to be completed in part B
        for(int i = entries.size()-1; i>=0; i--)
        {
            SparseArrayEntry entry = entries.get(i);
            if(entries.get(i).getCol() == col)
            {
                entries.remove(i);
            }
            else if(entries.get(i).getCol() > col)
            {
                entries.set(i, new SparseArrayEntry(entry.getRow(), entry.getCol()-1, entry.getValue()));
            }
        }
        numCols--;
    }
    public String toString(){
        String output = new String();
        for(int i=0; i<entries.size(); i++){
            
            output+="(";
            output+=this.entries.get(i).getRow();
            output+=",";
            output+=this.entries.get(i).getCol();
            output+=")";
            output+=" = ";
            output+=this.entries.get(i).getValue();
            output+="\n";
                
            
        }
        return output;
    }

}













