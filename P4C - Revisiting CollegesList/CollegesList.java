import java.util.ArrayList;

public class CollegesList
{
    private ArrayList<String> collegeList;
    public static void main()
    {
        ArrayList<String> collegeList = new ArrayList<String>();
        collegeList.add("las Positas");
        collegeList.add("UCee");
        collegeList.add("UC Davis");
        collegeList.add("San Jose SU");
        collegeList.add("University of Chicago");
        collegeList.add("UCLA");
        collegeList.add("UCSD");
        collegeList.add("Army");
        collegeList.add("Navy");
        //for each loop to print college in collegeList
        for(String currentCollege: collegeList)
        {
            System.out.println(currentCollege);
        }
        System.out.println("--------------------------------------");
        //for loop to remove each item with less or with 4 letters in collegeList
        
        for(int i = collegeList.size(); i>0; i--)
        {
            if(collegeList.get(i-1).length() <= 4)
            {
                collegeList.remove(i-1);
            }
        }
        
        
        //for loop to print each item with 5 letter and above
        for(int i = 0; i<collegeList.size(); i++)
        {
            System.out.println(collegeList.get(i));
        }
    }
}
