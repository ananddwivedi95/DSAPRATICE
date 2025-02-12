package Algo_Camp_DSA;
import java.util.*;
public class TwoSum {
   public static void main(String[] args)
   {  //betterforce
	   int [] nums= {2,7,11,15};
	   int target=9;
	   Solution ss= new Solution();
	   int arr2[]=ss.twoSum(nums,target);
	   for(int i:arr2)
	   {
		   System.out.print(i+" ");
	   }
	
   }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
              if(nums[i]+nums[j]==target)
              {
               arr[0]=i;
               arr[1]=j;
              }
            }
        }
        return arr;
    }
}