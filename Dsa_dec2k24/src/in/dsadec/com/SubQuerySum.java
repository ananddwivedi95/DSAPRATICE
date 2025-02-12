package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.List;

public class SubQuerySum {
  public static void main(String[] args)
  {
	  List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	  ArrayList<Integer> ar1= new ArrayList<Integer>(List.of(1 , 2 , 3));
	  ArrayList<Integer> ar2= new ArrayList<Integer>(List.of(3 , 4 , 1));
	  ArrayList<Integer> ar3= new ArrayList<Integer>(List.of(2 , 1 , 2));
	  
	  
	  list.add(ar1);
	  list.add(ar2);
	  list.add(ar3);
	  System.out.println(list);
  }
}
