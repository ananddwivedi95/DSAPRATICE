package Algo_Camp_DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SplitTheArray {
    public static void main(String[] args)
    {
    	int arr[]= {1,1,1,1};
    	
    	boolean result =splitTheArray(arr);
       System.out.println(result);
    }
    /*static boolean splitTheArray(int []nums)
    {
    	int arr[]= new int[nums.length/2];
        int arr_1[]=new int[nums.length/2];
        int index_arr=0;
        int index_arr_1=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
           if(i%2==0)
           {
               arr[index_arr++]=nums[i];
           }
           else if(i%2!=0)
           {
               arr_1[index_arr_1++]=nums[i];
           }
        }
        Arrays.sort(arr);
        Arrays.sort(arr_1);
        for(int i=0;i<nums.length/2;i++)
        {   
        	if((arr[i]!=arr_1[i]))
        	{
        		return true;
        	}
        }
        return false;
    }*/
     static boolean splitTheArray(int[] nums)
     {
    	 HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
    	 for(int i=0;i<nums.length;i++)
    	 {
    		 if(hs.containsKey(nums[i]))
    		 {
    			 hs.put(nums[i],hs.get(nums[i])+1);
    		 }
    		 else
    		 {
    			 hs.put(nums[i], 1);
    		 }
    	 }
    	 for(Integer i:hs.keySet())
    	 {
    		 if(hs.get(i)>2)
    		 {
    			return false;
    		 }
    	 }
    	return true;
     }
}
