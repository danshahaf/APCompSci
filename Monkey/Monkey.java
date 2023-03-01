
public class Monkey{
    //private variables and methods can only be accessed by that same class
    //public methods can be accessed by other classes
    private int bananasEaten;
    private String name;
    public Monkey(){
        this.bananasEaten=10;
        this.name="George";
    }
    public Monkey(int bananasEaten, String name){
        this.bananasEaten=bananasEaten;
        this.name=new String(name);
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
    public String toString(){
        String output=new String("Bananas Eaten: " + this.bananasEaten + "\tName: " + this.name);
        return output;
    }
}