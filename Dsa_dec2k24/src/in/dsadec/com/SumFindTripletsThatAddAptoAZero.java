package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumFindTripletsThatAddAptoAZero {
   public static void main(String[] args)
   {
	   int arr[]= {-1,0,1,2,-1,-4};
	   sumFindTriplets(arr);
   }
   /*static void sumFindTriplets(int arr[])
   {  
	    Set<List<Integer>> set= new HashSet<>();
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   for(int k=j+1;k<arr.length;k++)
			   {   
				   
				   if(arr[i]+arr[j]+arr[k]==0)
				   {  
					   ArrayList<Integer> list= new ArrayList<>();
					  //List<Integer> list= Arrays.asList(arr[i],arr[j],arr[k]);
					   list.add(arr[i]);
					   list.add(arr[j]);
					   list.add(arr[k]);
					   
					  list.sort(null);
					  set.add(list);
				   }
			   }
		   }
	   }
	   //List<List<Integer>> li=new ArrayList<>(set);
	   System.out.println(set);
   }*/
   static void sumFindTriplets(int arr[])
   {
	   HashSet<List<Integer>>set= new HashSet<List<Integer>>();
	   for(int i=0;i<arr.length;i++)
	   {   
		   HashSet<Integer> hs= new HashSet<Integer>();
		   for(int j=i+1;j<arr.length;j++)
		   {
			  int third=-(arr[i]+arr[j]);
			  if(hs.contains(third))
			  {
                  ArrayList<Integer> list= new ArrayList<Integer>();
				   list.add(arr[i]);
				   list.add(arr[j]);
				   list.add(third);
				   list.sort(null);
				   set.add(list);
			  }
			  else
			  {
				  hs.add(arr[j]);
			  }
		   }
	   }
	   System.out.println(set);
   }
}
