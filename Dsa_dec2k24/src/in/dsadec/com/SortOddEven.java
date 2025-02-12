package Algo_Camp_DSA;

import java.util.Arrays;
import java.util.Collections;

public class SortOddEven {
    public static void main(String[] args)
    {
    	int arr[]= {27, 37, 30, 39 ,1 ,1 ,41 ,30, 15, 17 }; 
    	sort(arr);
    }
    static void sort(int arr[])
    {
    	int count_Odd=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%2!=0)
    		{
    			count_Odd++;
    		}
    	}
        Integer arrOdd[]= new Integer[count_Odd];
    	int arrEven[]= new int[arr.length-count_Odd];
    	int index=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%2!=0)
    		{
    			arrOdd[index++]=arr[i];
    		}
    	}
    	 Arrays.sort(arrOdd, Collections.reverseOrder());
    	
    	index=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%2==0)
    		{
    			arrEven[index++]=arr[i];
    		}
    	}
    	Arrays.sort(arrEven);
    	int index_Odd=0;
    	int index_Even=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i<arrOdd.length)
    		{
    			arr[i]=arrOdd[index_Odd++];
    		}
    		else 
    		{
    			arr[i]=arrEven[index_Even++];
    		}
    	}
    	for(int i:arr)
    	{
    	System.out.print(i+" ");
    	}
    }
}
