package Algo_Camp_DSA;

public class InterestingAlphabets {
    public static void main(String[] args)
    {
    	interestingAlphabets(5);
    }
    static void interestingAlphabets(int n)
    {
    	int count=64+n;
    	for(int i=0;i<n;i++)
    	{ 
    		int k=i;
    		for(int j=0;j<=i;j++)
    		{
    			System.out.print((char)(count-k));
    			k--;
    		}
    		System.out.println();
    	}
    }
}
