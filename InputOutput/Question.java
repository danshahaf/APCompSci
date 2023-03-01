import javax.swing.JOptionPane;

public class Question 
{
    public static void main()
    {
       //String variable to hold anwer to our question
       String answer1 = JOptionPane.showInputDialog("Game 1 Score?");
       String answer2 = JOptionPane.showInputDialog("Game 2 score?");
       String answer3 = JOptionPane.showInputDialog("Game 3 score?");
       
       //create an int variable that parses(changes String to #)
       //answer into a number so we can add to it
       int score1 = Integer.parseInt(answer1);
       int score2 = Integer.parseInt(answer2);
       int score3 = Integer.parseInt(answer3);
       int average = score1+score2+score3;
       int averageDevide = average/3;
       System.out.println("Your average score is " + averageDevide + ".");
    }//end main method
}//end class