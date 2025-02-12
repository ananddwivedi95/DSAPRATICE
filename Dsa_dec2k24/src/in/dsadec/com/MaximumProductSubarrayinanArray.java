package Algo_Camp_DSA;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaximumProductSubarrayinanArray {
    public static void main(String[] args)
    {
    	int arr[]= {1 ,-2 ,3 ,4};
    	maximumProductSubarrayinanArray(arr);
    }
    //brute_force
   /*static void  maximumProductSubarrayinanArray(int arr[])
    {
	   int max=Integer.MIN_VALUE;
   	
   	for(int i=0;i<arr.length;i++)
   	{   
   		int product=1;
   		for(int j=i;j<arr.length;j++)
   		{
   			product*=arr[j];
   			max=Math.max(max, product);
   		}
   	}
    	System.out.println(max);
    }*/
    static void maximumProductSubarrayinanArray(int arr[])
    {  
List<Integer> li= new ArrayList<Integer>();
    	
    	int suffix_product=1;
		int preefix_product=1;
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(suffix_product==0)
			{
				suffix_product=1;
			}
			if(preefix_product==0)
			{
				preefix_product=1;
			}
			preefix_product*=arr[i];
            suffix_product*=arr[arr.length-1-i];
			max=Math.max(max,Math.max(preefix_product, suffix_product));
    		
    	}
        System.out.println(max);
    }
}
