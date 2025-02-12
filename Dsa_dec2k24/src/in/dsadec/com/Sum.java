package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sum {
  public static void main(String[] args)
  {
	  int arr[]= { 1,0,-1,0,-2,2};
	  int target=0;
	  sumFore(arr,target);
   }
  static void sumFore(int arr[] ,int target)
  {    
	  HashSet<List<Integer>> hs= new HashSet<List<Integer>>();
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  HashSet<Integer> hs1= new HashSet<Integer>();
			  for(int k=j+1;k<arr.length;k++)
			  {
				  int fourth= target-(arr[i]+arr[j]+arr[k]);
				  if(hs1.contains(fourth))
				  {
					  ArrayList<Integer> ar= new ArrayList<Integer>();
					  ar.add(arr[i]);
					  ar.add(arr[j]);
					  ar.add(arr[k]);
					  ar.add(fourth);
					  ar.sort(null);
					  hs.add(ar);
				  }
				  else
				  {
					  hs1.add(arr[k]);
				  }
				  
			  }
		  }
	  }
	  System.out.println(hs);
  }
  
}
