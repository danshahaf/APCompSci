
public class Driver
{
    public static void main(){
    BatteryCharger charger1 = new BatteryCharger();
    
    //in order to run this, you need to make the getChargingCost method public
    System.out.println(charger1.getChargingCost(12,1));
    System.out.println(charger1.getChargingCost(0,2));
    System.out.println(charger1.getChargingCost(22,7));
    System.out.println(charger1.getChargingCost(22,30));
    //these 4 calls should return 40,110,550,3710
    
    
    System.out.println(charger1.getChargeStartTime(1));
    System.out.println(charger1.getChargeStartTime(2));
    System.out.println(charger1.getChargeStartTime(7));
    System.out.println(charger1.getChargeStartTime(30));
    
    //these 4 calls should return 12,0(or 23),22,22
}
}


