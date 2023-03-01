

public class Colleges
{
    public static void main(){ 
        String[] colleges = {"Stanford", "UC Berkley", "UCLA", "Santa Barbara"};
        for(int i = 0; i<colleges.length; i++){
             System.out.println(colleges[i] + ": " + colleges[i].length());        
        
        }
        int shortest=colleges[0].length();
        int sc=0;
        for(int i = 1; i<colleges.length; i++){
            if(colleges[i].length()<shortest){
                shortest=colleges[i].length(); 
                sc=i;
            }
        }
        System.out.println("The college with the least amount of letters is "+colleges[sc]+" because it has "+shortest+" letters.");
        colleges[3]=null;
        
        for(int i = 0; i<colleges.length; i++){
            System.out.println(colleges[i]);
        }
        for(int i = 0; i<colleges.length; i++){
            if(colleges[i]==null)
            {   
                System.out.println("Doesn't exist");
            }
            else
            {   
                System.out.println(colleges[i].length());
            }
            
        }
        
    }
}

