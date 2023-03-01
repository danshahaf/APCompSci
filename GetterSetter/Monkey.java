
public class Monkey{
    //private variables and methods can only be accessed by that same class
    //public methods can be accessed by other classes
    private int bananasEaten;
    private String name;
    private int[] ppd;
    //(poops per day)
    public Monkey(){
        this.bananasEaten=10;
        this.name="George";
        this.ppd=new int[4];
        ppd[0]=50;
        ppd[1]=50;
        ppd[2]=50;
        ppd[3]=51;
        
        //faster way 
        //ppd = new int[] {50,50,50,51};
    }
    public Monkey(int bananasEaten, String name, int d1, int d2, int d3, int d4){
        this.bananasEaten=bananasEaten;
        this.name=new String(name);
        this.ppd= new int[]{d1,d2,d3,d4};
    }
    //getter method for bananasEaten
    public int getBananasEaten(){
        return bananasEaten;
    }
    //also know as accessor methods
    //getter method for name
    public String getName(){
        return name;
    }
    //setter methods also known as mutators
    public void setBananasEaten(int bananasEaten){
        this.bananasEaten=bananasEaten;
    }
    public void setName(String name){
        this.name=name;
    }
    
    private double calcPpdAvg(){
        double average=0;
        for(int i=0; i<ppd.length;i++)
        {
            average+=ppd[i];
        }
        average= average/ppd.length;
        //average/=ppd.length;
        return average;
    }
    
    //not needed
    public String toString(){
        String output=new String("Bananas Eaten: " + this.bananasEaten + "\tName: " + this.name);
        output+=("\tPoops per day is " + calcPpdAvg());
        return output;
    }
}