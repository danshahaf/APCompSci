
public class Driver
{
    public static void main(){
        
        SparseArrayEntry entry1 = new SparseArrayEntry(1,4,4);
        SparseArrayEntry entry2 = new SparseArrayEntry(2,0,1);
        SparseArrayEntry entry3 = new SparseArrayEntry(3,1,-9);
        SparseArrayEntry entry4 = new SparseArrayEntry(1,1,5);
        
        SparseArray array1 = new SparseArray();
        
        array1.addEntry(entry1);
        array1.addEntry(entry2);
        array1.addEntry(entry3);
        array1.addEntry(entry4);
        
        System.out.println("Value at (3,1): "+array1.getValueAt(3,1));
        System.out.println("Value at (3,3): "+array1.getValueAt(3,3));
        
        System.out.println();
        System.out.println("Now printing all values in the SparseArray...");
        System.out.println(array1);
        
        array1.removeColumn(1);
        
        System.out.println("Printing all values in the SparseArray after removing Column 1...");
        System.out.println(array1);
        
    }
}
