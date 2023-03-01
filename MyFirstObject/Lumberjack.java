public class Lumberjack
{
    //The Lumberjack class can be use dto create multiple LumberJack objects
    //each Class always has the Big 3
    //1)INSTANCE VARIABLES
    // private instance variable can only be used in the Lumberjack Class
    private boolean hasBeard;
    private int age;
    private double weight;
    
    //2)CONSTRUCTOR 
    // A method that executes each time a new Lumberjack object is created
    //Constructors are always public, no return type, and name is always the class name
    public Lumberjack()
    {
        hasBeard =true;
        age = 30;
        weight =600.4;
        
    }
    
    //3) toString() method
    public String toString()
    {
        String output =new String();
        output= "It is " + hasBeard + " that our lumber has a beard.";
        output += "Lumber jack has an age of " + age + ".\n";
        output += "Lumber jack has a weight of " + weight + ".\n";
        
        return;
    }
    
}