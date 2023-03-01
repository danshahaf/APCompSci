
public class Driver
{
    public static void main() {
        
      Family myFamily = new Family();
      System.out.println(myFamily.toString());
      myFamily.sortByAge();
      System.out.println("---------------------------------");
      System.out.println(myFamily.toString());
        
    }
}
