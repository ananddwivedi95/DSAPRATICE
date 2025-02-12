package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElementII {
	public static void main(String[] args){
		int arr[]= {1,3};
		List<Integer> result=majorityElement(arr);
		System.out.println(result);
		}
	public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
        ArrayList<Integer> ar= new ArrayList<Integer>();

       for(int i=0;i<nums.length;i++)
       {
         if((hs.containsKey(nums[i])))
         {
            hs.put(nums[i],hs.get(nums[i])+1);
         }
         else
         {
            hs.put(nums[i],1);
         }
       }
         int majority_element=0;
         for(Integer key:hs.keySet())
         {
        	 if(hs.get(key)>nums.length/3)
        	 {
        		 ar.add(key);
        	 }
         }
         return ar;
	}
}
        