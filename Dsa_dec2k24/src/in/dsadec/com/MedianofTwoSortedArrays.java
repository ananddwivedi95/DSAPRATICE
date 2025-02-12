package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianofTwoSortedArrays {
   public static void main(String[] args)
   {
	   int arr[]= {1,3};
	   int arrr[]= {2,4};
	   medianofTwoSortedArrays(arr,arrr);
   }
   static void medianofTwoSortedArrays(int arr[],int arrr[])
   {
	   
	   List<Integer> list= new ArrayList<Integer>();
	   for(int i=0;i<arr.length;i++)
	   {
		    list.add(arr[i]);
	   }
	   for(int i=0;i<arrr.length;i++)
	   {
		    list.add(arrr[i]);
	   }
	   double median=0;
	   int arr_r[]=new int[list.size()];
	   for(int i=0;i<arr_r.length;i++)
	   {
		   arr_r[i]=list.get(i);
	   }
	   for(int i=0;i<arr_r.length;i++)
	   {
		   median+=arr_r[i];
	   }
	   double sum=median/list.size();
	   System.out.println(sum);
	   System.out.println(list);
   }
}
