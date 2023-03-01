

public class BatteryCharger
{
    private int[] costArray;
    private int price;
    private int cost;
    public BatteryCharger(){
        costArray = new int[]{50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
        
    }
    public int getChargingCost(int startingHour, int chargeTime)
    {
        int counter = startingHour;
        price = 0;
        for(int i = 0; i<chargeTime; i++)
        {
            
            if(counter == 23)
            {
                price += costArray[counter];
                counter = -1;
            }
            else
            {
                price += costArray[counter];
            }
            counter++;
        }
        return price;
    }
    public int getChargeStartTime(int chargeTime)
    {
        int cost = getChargingCost(0, chargeTime);
        int time = 0;
        for (int i = 1; i<24; i++)
        {
            if(getChargingCost(i, chargeTime) < cost)
            {
                cost = getChargingCost(i, chargeTime);
                time = i;
            }
        }
        
        return time;
    }
}
