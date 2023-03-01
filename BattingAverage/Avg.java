public class Avg{
    public static void main(){
        //variables and arrays
        double GV=0;
        double[] averages = new double [900];
        
        System.out.println("\n\n Averages");
        for(int i=0;i<averages.length;i++){
            double randInt =(double)(Math.random()*.500);
            randInt=((double)Math.round(randInt*1000)/1000);
            averages[i]=randInt;
        }
        for(int i=0;i<averages.length;i++){
            //System.out.format("\t", averages[i]);
            System.out.print(averages[i]+"\t\t");
        }
        
        System.out.println("\n\nCorrected averages");
        
        for(int i=0;i<averages.length;i++){
            averages[i]=((double)Math.round((averages[i] + 0.02)*1000)/1000);
        }
        for(int i=0;i<averages.length;i++){
            //System.out.format("%.3f%n", averages[i]);
            System.out.print(averages[i]+"\t\t");
        }
       
        System.out.println("\n\nReverse averages");
        
        for(int i=0;i<averages.length;i++){
            //System.out.format("%.3f%n", averages[i]);
            System.out.print(averages[averages.length-1-i]+"\t\t");
        }
        
        for(int i=0;i<averages.length;i++){
            if(averages[i]<GV){
                GV=averages[i];
            }
        }
        
        System.out.println("\n\nGVOAT: "+GV);
        
        
    }
}