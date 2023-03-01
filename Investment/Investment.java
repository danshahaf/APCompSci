import javax.swing.JOptionPane;
public class Investment
{
    public static void notmain()
    {
        int currentAge = Integer.parseInt(JOptionPane.showInputDialog("Current Age"));
        int investmentAmount = Integer.parseInt(JOptionPane.showInputDialog("\nAmount Invested"));
        int numYears = Integer.parseInt(JOptionPane.showInputDialog("Years of Investment"));
        double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Interest Rate?"));
        interestRate = interestRate/100;
        
        System.out.println("\t\t Investment Analysis");
        System.out.println("Initial Investment: " + investmentAmount);
        System.out.println("Rate of Return: 10%");
        System.out.println("\t\t End of Year Balance \t End of Year Balance");
        System.out.println("Year\t Age\t One Time Investment\t Annual Investment");
        
        int[] years = new int [numYears];
        for(int i=0; i<(numYears); i++)
        {
            years[i]=(i+2016);            
        }
        
        int[] ages = new int [numYears];
        for(int i=0; i<(numYears); i++)
        {
            ages[i] = (i + currentAge);
        }
        
        double[] oneTimeInvestment = new double [numYears];
        for(int i=0; i<(numYears); i++)
        {
            if(i==0)
            {
                oneTimeInvestment[i] = Math.round(investmentAmount*(1 + interestRate)*100.00)/100.00;
            }
            else
            {
                oneTimeInvestment[i] = Math.round((oneTimeInvestment[i-1])*(1 + interestRate)*100.00)/100.00;
            }
        }
        
        double[] annualInvestment = new double [numYears];
        for(int i=0; i<(numYears); i++)
        {
            if(i==0)
            {
                annualInvestment[i] = Math.round((investmentAmount)*(1 + interestRate)*100.00)/100.00;
            }
            else
            {
                annualInvestment[i] = Math.round((annualInvestment[i-1]+investmentAmount)*(1 + interestRate)*100.00)/100.00;
            }
        }
        
        for(int i=0; i<(numYears); i++)
        {
            if(i<=3)
            {
                System.out.println(years[i] + "\t" + ages[i] + "\t$" + oneTimeInvestment[i] + "\t\t\t$" + annualInvestment[i]);
            }
            else
            {
                System.out.println(years[i] + "\t" + ages[i] + "\t$" + oneTimeInvestment[i] + "\t\t$" + annualInvestment[i]);
            }
        }
    }
}






