

public class QuadraticEquation
{
    private int a;
    private int b;
    private int c;
    public QuadraticEquation()
    {
        a=0;
        b=0;
        c=0;
    }
    public QuadraticEquation(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getB()
    {
        return b;
    }
    public void satB(int b)
    {
        this.b = b;
    }
    public int calDiscriminant()
    {
        return ((b*b) - (4*a*c));
    }
    public double calcRoot1()
    {
        return ((-b) + (Math.sqrt(calDiscriminant()))) / (2*a);
    }
    public double calcRoot2()
    {
        return ((-b) - (Math.sqrt(calDiscriminant()))) / (2*a);
    }
    public String toString()
    {
        String output = new String();
        if(calDiscriminant() >= 0)
        {
            output += "\nThe Qadratic Equation is: " + a + "x^2 + " + b + "x + " + c + " = 0";
            output += "\nvalue of Discriminant: " + calDiscriminant();
            output += "\nRoot 1: " + calcRoot1();
            output += "\nRoot 2: " + calcRoot2();
        }
        else if(calDiscriminant() < 0)
        {
            output += "\nThe Qadratic Equation is: " + a + "x^2 + " + b + "x + " + c + " = 0";
            output += "\nvalue of Discriminant: " + calDiscriminant();
            output += "\nThere Are NO Real Roots";
        }
        return output;
    }
}



