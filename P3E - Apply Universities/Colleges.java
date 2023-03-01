

public class Colleges
{

   public static void main()
   {
       String school1 = new String("aaka");
       String school2 = new String("aaa");
       String school3 = new String ("University of Chicago");
       System.out.println(school1.compareTo(school2));
       System.out.println(school1.compareTo(school3));
       System.out.println(school2.compareTo(school3));
       //1) The output of the compareTo() method tells us the lexicorgaphical order of the String
       // It ubstracts the numeric valkue of the letters from the compared school's letters.
       //2) It tells the difference between the numeric value of the first different letters in the 
       // STrings(in this case it is the second letter)
       
   }
   
}
