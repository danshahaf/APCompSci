

public class RightTriangle
{
    private int base;
    private int height;
    public RightTriangle()
    {
        height = 0;
        base = 0;
    }
    public RightTriangle(int height, int base)
    {
        this.height = height;
        this.base = base;
    }
    public int getBase()
    {
        return base;
    }
    public void setBase(int base)
    {
        this.base = base;
    }
    public double calcHypotenuse()
    {
        return Math.sqrt(((base)*(base)) + ((height)*(height)));
    }
    public double calcAlpha()
    {
        double a = (double)height/base;
        return (Math.atan(a) * 180.0/3.1415);

    }
    public double calcArea()
    {
        return ((height*base)/2);
    }
    public String toString()
    {
        String output = new String();
        
        if(height ==0||base ==0)
        {
            System.out.println("No Stats Recorded");
        }
        else
        {
            output +=  " base: " + base;
            output += "\n height: " + height;
            output += "\n hypotenuse: " + calcHypotenuse();
            output += "\n angle Alpha: " + calcAlpha();
            output+= "\n area: " + calcArea();
            output += "\n--------------------------------------";
        }
        
        return output;
    }
}














