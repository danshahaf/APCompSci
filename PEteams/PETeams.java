import javax.swing.JOptionPane;
public class PETeams{
    public static void main(){
        /*int numerator = 15;
        double denominator = 2;
        double answer = numerator/denominator;
        System.out.println(answer);*/
        
        String classSizeS = JOptionPane.showInputDialog("How many students are in the class");
        int classSize = Integer.parseInt(classSizeS);
        String teamSizeS = JOptionPane.showInputDialog("How many students per a team");
        int teamSize = Integer.parseInt(teamSizeS);
        
        
        int numTeams = classSize/teamSize;
        int leftOvers = classSize%teamSize;
        
        System.out.println("Class Size\tTeam Size\tNumber of Teams\tLeftovers");
        System.out.println(classSize+"\t"+teamSize+"\t"+numTeams+"\t"+leftOvers);
    }
}