public class MonkeyDriver{
    public static void main(){
        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey(12, "Gertrude", 100, 100, 100, 101);
        //System.out.println(m1.calcPpdAvg());
        //System.out.println(m2.calcPpdAvg());
        System.out.println(m1);
        System.out.println(m2);
        
        //print getter methods
        //dot operator example object.method()
        //ex. student7.getGrade() would return the grade for a specicfic student
        
        /*System.out.println(m1.getBananasEaten());
        m1.setBananasEaten(1234567);
        System.out.println(m1.getBananasEaten());
        
        
        
        System.out.println(m2.getName());
        m2.setName("Avery");
        System.out.println(m2.getName());*/
    }
}