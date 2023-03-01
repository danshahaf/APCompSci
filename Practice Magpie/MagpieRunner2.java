import java.util.Scanner;
public class MagpieRunner2

{

/**

* Create a Magpie, give it user input, and print its replies.

*/

public static void main()

{

Magpie2 maggie = new Magpie2();

System.out.println (maggie.getGreeting());

Scanner in = new Scanner (System.in);

String statement = in.nextLine();

while (!statement.equals("Bye"))

{

System.out.println (maggie.getResponse(statement));

statement = in.nextLine();

}

}

}

/**

* A program to allow students to try out different

* String methods.

* @author Laurie White

* @version April 2012

*/