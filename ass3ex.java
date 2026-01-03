package array;

public class ass3ex
{
    public static void buy(int prices[])
    {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
                System.out.println(profit);
            }
            else
            {
                buyprice=prices[i];
                System.out.println("0");
            }
        }
        
    }
    public static void main(String args[])
    {
        int prices[]={7,1,5,3,6,4};
        buy(prices);

    }
}
    

