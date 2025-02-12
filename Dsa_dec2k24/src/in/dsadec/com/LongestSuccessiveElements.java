package Algo_Camp_DSA;

import java.util.Arrays;

public class LongestSuccessiveElements {
    public static void main(String[] args)
    {
    	int arr[]= {5, 4 ,3};//1,1,2,2//5, 8, 3, 2, 1, 4--
        int result=show(arr);
        System.out.println(result);
    }
    //brute_force
    /*static int show(int[] arr)
    {   
    	  int max=0;
    	  int count=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		count=0;
    		int cons_Element=arr[i];
    		for(int j=0;j<arr.length;)
    		{
    			if(cons_Element==arr[j])
    			{
    				cons_Element+=1;
    				count++;
    				j=0;
    			}
    			else
    			{
    				j++;
    			}
    		}
    
    	     max=Math.max(count, max);
    	}
    	return max;
    }*/
    //optimal_Solution
    static int show(int[] arr)
    {
    	int count=0;
    	int length=1;
    	int last_Element=Integer.MIN_VALUE;
    	Arrays.sort(arr);
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]-1==last_Element)
    		{
    			count++;
    			last_Element=arr[i];
    		}
    		else if(arr[i]!=last_Element)
    		{
    			count=1;
    			last_Element=arr[i];
    		}
    		length=Math.max(length,count);
    	}
    	return length;
    }
}
