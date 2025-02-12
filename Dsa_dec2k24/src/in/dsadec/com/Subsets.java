package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
  public static void main(String[] args)
  {
	  int arr[]= {1,2,3};
	  subSet(arr);
  }
  static void subSet(int arr[])
  {  
	  List<List<Integer>> listt= new ArrayList<>();
	  for(int i=0;i<arr.length;i++)
	  {
		  List<Integer> list= new ArrayList<Integer>();
		  for(int j=i;j<arr.length;j++)
		  {
			  list.add(arr[i]);
			 
		  }
		  listt.add(list);
		
	  }
	  System.out.println(listt);
  }
}
