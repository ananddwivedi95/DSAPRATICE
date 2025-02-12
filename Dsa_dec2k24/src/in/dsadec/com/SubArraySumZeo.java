package Algo_Camp_DSA;

import java.util.HashMap;

public class SubArraySumZeo {
    public static void main(String[] args)
    {
    	int arr[]= {6,4,-5,1,8,3,2,-10,-4,0,4,-9};
      int result= subArraySumZero(arr);
      System.out.println(result);
    }
    //Brute_Force
    /*static int subArraySumZero(int []arr)
    {    int count=0;
    	for(int i=0;i<arr.length;i++)
    	{     int sum=0;
    		for(int j=i;j<arr.length;j++)
    		{
    			sum+=arr[j];
    			if(sum==0)
    			{
    				count++;
    			}
    		}
    	}
    	return count;
    }*/
    static  int subArraySumZero(int arr[])
    {
    	HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
    	int sum=0;
    	int count=0;
    	hs.put(0,1);
    	for(int i=0;i<arr.length;i++)
    	{
    		sum+=arr[i];
    		
    	    if(hs.containsKey(sum))
    	    {  
    	    	count+=hs.get(sum);
    	    	hs.put(sum, hs.get(sum)+1);
    	    }
    	    else
    	    {
    	    	hs.put(sum, 1);
    	    }
    	}
    	System.out.println(hs+" "+count);
    	return 0;
    }
}
