

public class Sundays
{
    public static void main()
    {
        int counter = 0;
        
        int years = 2000 - 1900;
        int months = years * 12;
        int days = 0;//months * 28;
        for(int i = 0; i<years; i++)
        {
            for(int b = 0; b<11; b++)
            {
                if( b == 0 || b ==2 || b ==4 || b ==6 || b ==7 || b ==9 || b ==11)
                {
                    days += 31;
                }
                else if(b == 1)
                {
                    days += 28;
                }
                else
                {
                    days += 30;
                }
                
            }
            
        }
        for(int i = 1900; i<=2000; i++)
        {
            if(i % 400 != 0)
            {
                if(i%4 == 0)
                {
                    days ++;
                }
            }
        }
        System.out.println("Years: \t\t" + years);
        System.out.println("Months: \t" + months);
        System.out.println("Days: \t\t" + days);
        for(int i = 0; i<=days; i++)
        {
            if(i % 6 == 0)
            {
                counter++;
            }
        }
        System.out.println("Sundays: \t" + counter);
    }
}
