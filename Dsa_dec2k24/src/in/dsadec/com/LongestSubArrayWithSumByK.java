package Algo_Camp_DSA;

public class LongestSubArrayWithSumByK {
    public static void main(String[] args)
    {
       int arr[] = {1,2,3,1,1,1,1,4,2,3};
       int k=4;
      int result= longestSubArray(arr,k);
      System.out.println(result);
    }
    //brute_force
    static int longestSubArray(int arr[],int k)
    {   
    	int count=0;
    	int len=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++)
    	{
    		int sum=0;
    		count=0;
    		for(int j=i;j<arr.length;j++)
    		{
    			sum+=arr[j];
    			 count++; 
    			if(sum==k)
    			{ 
    			    len=Math.max(len,count );
    			
    			}
    		}
    		
    	}
    	return len;
    }
}
