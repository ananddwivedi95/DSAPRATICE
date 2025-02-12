package Algo_Camp_DSA;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args)
    {
    	int arr[]= {-1,1,0};
    	int k=0;
    	int result =subArraySumEqualsK(arr,k);
    	System.out.println(result);
    	System.out.println("anand");
    }
    //brute_force
    /*static int subArraySumEqualsK(int[] arr,int k)
    {
    	int count=0;
        int sum=0;
         for(int i=0;i<arr.length;i++)
         {
              sum=0;
             for(int j=i;j<arr.length;j++)
             {
                 sum+=arr[j];
                 if(sum==k)
                 {
                     count++;
                 }
             }
         }
         return count;
    }*/
    static int subArraySumEqualsK(int arr[],int k)
    {
    	HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
     	int sum=0;
     	int count=0;
     	hs.put(0,1);
     	for(int i=0;i<arr.length;i++)
     	{
     		sum+=arr[i];
     		int currentSum=sum-k;
     		if(hs.containsKey(currentSum))
     		 {
     		 count+=hs.get(currentSum);
     		 }
     		if(hs.containsKey(sum))
     		{
     		 hs.put(sum, hs.get(sum)+1);
     	    }
         	else
      		{
     			hs.put(sum,1);
     		}
         }  
     		return count;
      } 
     	
     		
 
}
