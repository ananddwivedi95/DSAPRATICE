package Algo_Camp_DSA;

public class MaxConsecutiveOnes {
    public static void main(String[] args)
    {
    	int arr[]= {1,0,1,1,0,1};
    	int result=maxConsecutiveOnes(arr);
    	System.out.println(result);
    }
    //better_Solution
    static int maxConsecutiveOnes(int []arr)
    {
    	int temp=0;
    	int count=0;
    	int max=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]!=0)
    		{
    			count++;
    			max=count;
    		}
    		else
    		{
    			count=0;
    		}
    		temp=Math.max(max, temp);
    	}
    	return temp;
    }
    
}
