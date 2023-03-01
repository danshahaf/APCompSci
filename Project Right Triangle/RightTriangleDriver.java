

public class RightTriangleDriver
{
    public static void main()
    {
        RightTriangle triangle1 = new RightTriangle();
        System.out.println(triangle1);
        RightTriangle triangle2 = new RightTriangle(4,3);
        System.out.println(triangle2);
        triangle2.setBase(6);
        System.out.println(triangle2);
    }
    
    
}
