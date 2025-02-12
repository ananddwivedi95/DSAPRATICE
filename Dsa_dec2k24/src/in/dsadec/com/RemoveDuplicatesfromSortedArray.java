package Algo_Camp_DSA;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesfromSortedArray {
     public static void main(String[] args)
     {
    	 int [] nums= {0,0,1,1,1,2,2,3,3,4};
    	 duplicate(nums);
     }
     //brute_Force
     /*static void duplicate(int nums[])
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
    			 hs.put(nums[i],1);
    		 }
    	 }
    	 
    	 int j=0;
         for(Integer i: hs.keySet())
         {
               nums[j++]=i;
         }
         
    	 System.out.println(hs.size());
     }*/
     //optimal_Solution
     static void duplicate(int nums[])
     {
    	 Arrays.sort(nums);
    	int j=0;
    	int index_up=0;
    	for(int i=j+1;i<nums.length;i++)
    	{
    		if(nums[i]!=nums[j])
    		{
    			nums[j+1]=nums[i];
    			j++;
    			index_up++;
    		}
    	}
        for(int i:nums)
        {
        	System.out.print(i+" ");
        }
        System.out.println(" total no of unique element : "+(index_up+1));
       
     }
}
