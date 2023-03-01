

public abstract class Parent
{
    private int age;
    public Parent()
    {
        age = 50;
    }
    public abstract String getSaying();
    //{
     //   return "Clean your room";
    //}
    public String toString()
    {
        String output = new String("");
        output += "\nAge: " + this.age;
        output +="\n" + getSaying();
        return output;
    }
}
