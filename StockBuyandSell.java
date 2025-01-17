package in.dsadec.com;

public class StockBuyandSell {
    public static void main(String[] args)
    {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
       //part1  System.out.println(maximumProfit(arr));
       //part2 System.out.println(maximumProfitpart2(arr));

    }
    //part 1 Multiple Transaction Allowed
    public  static int maximumProfit(int prices[]) {
        // code here
        int buy=prices[0];
        int shell=0;
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[i-1])
            {
                shell=prices[i-1];
                profit+=shell-buy;
                buy=prices[i];

            }
            if(i==prices.length-1)
            {
                shell=prices[prices.length-1];
                profit+=shell-buy;
            }
        }
        return profit;
    }


    // paet 2 Max one Transaction Allowed
    public static  int maximumProfitpart2(int prices[]) {
        // Code here
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            min =Math.min(min,prices[i]);

            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }

}
