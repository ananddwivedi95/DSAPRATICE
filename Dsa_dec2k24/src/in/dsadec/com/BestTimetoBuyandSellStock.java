package Algo_Camp_DSA;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args)
    {
    	int price[]= {3,2,6,5,0,3};
    	int result=bestTimeForBuyShell(price);
    	System.out.println(result);
    }
    /*static int bestTimeForBuyShell(int price[])
    {   int max=0;
    	for(int i=0;i<price.length;i++)
    	{
    		for(int j=i+1;j<price.length;j++)
    		{
    			if(price[j]>price[i])
    			{
    				max=Math.max(price[j]-price[i], max);
    			}
    		}
    	}
    	
    	return max;
    }*/
    
    static int bestTimeForBuyShell(int price[])
    {   int min_Stock=Integer.MAX_VALUE;
    	int max=0;
    	for(int i=0;i<price.length;i++)
    	{
    		if(min_Stock>price[i])
    		{
    		min_Stock=price[i];
    		}
    		else if(price[i]-min_Stock>max)
    		{
    			max=price[i]-min_Stock;
    		}
    	}
    	return max;
    }
}
