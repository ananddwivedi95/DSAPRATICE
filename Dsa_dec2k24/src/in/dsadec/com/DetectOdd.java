package Algo_Camp_DSA;

import java.util.HashMap;

public class DetectOdd {
  public static void main(String[] args)
  {
	  int arr[]= {1, 1, 2, 3, 4, 4};
	  detectOdd(arr);
   }
  static void detectOdd(int nums[])
  {
	  int arr[]= new int[2];
      HashMap<Integer,Integer> hss= new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++)
      {
         if(hss.containsKey(nums[i]))
         {
           hss.put(nums[i], hss.get(nums[i])+1);
         }
         else{
             hss.put(nums[i],1);
         }
      }
       int index=0;
      for(Integer key:hss.keySet())
      {
          if(hss.get(key)%2!=0)
          {
              arr[index++]=key;
          }
      }
       for(int i:arr)
       {
    	   System.out.println(i);
       }
  }
}
