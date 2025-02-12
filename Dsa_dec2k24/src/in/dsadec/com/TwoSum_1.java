package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.HashMap;
  //optimalforce
public class TwoSum_1 {
     public static void main(String[] args)
     {
    	 int  []nums = {3,2,4};
    	 int target = 6;
    	int []arr=SolutionForTwoSum.twoSum(nums,target);
    	for(int i:arr)
    	{
    		System.out.print(i+",");
    	}
     }
}
class SolutionForTwoSum {
    static int[] twoSum(int[] nums, int target) {
    	int arr_1[]=new int[2];
    	ArrayList<Integer> hss= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        { 
        	int current_value=nums[i];
        	int required_value=target-current_value;
        	if(hss.contains(required_value))
        	{
        		int index=hss.indexOf(required_value);
        		arr_1[0]=index;
        		arr_1[1]=i;
        		return arr_1;
        	}
        	hss.add(nums[i]);
        	
        	
        }
        return arr_1;
    }
}
