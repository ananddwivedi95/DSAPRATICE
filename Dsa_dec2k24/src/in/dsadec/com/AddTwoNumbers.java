package Algo_Camp_DSA;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
  public static void main(String[] args)
  {
	  List<Integer> li= List.of(9,9,9,9,9,9,9);
	  List<Integer> lii=List.of(9,9,9,9);
	  addTwoNumbers(li,lii);
  }
  static void addTwoNumbers(List<Integer> li,List<Integer> lii)
  {
	  int arr[]=new int[li.size()];
	  int arrr[]= new int[lii.size()];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=li.get(i);
	  }
	  for(int i=0;i<arrr.length;i++)
	  {
		  arrr[i]=lii.get(i);
	  }
	  int list1_size=li.size()-1;
	  int list2_size=lii.size()-1;
	  int qunt=0;
	  List<Integer> list=new ArrayList<Integer>();
	  while(list1_size>=0||list2_size>=0)
	  {
		  if(list1_size>=0&&list2_size>=0)
		  {
			  int sum=arr[list1_size]+arrr[list2_size]+qunt;
			  int rem=sum%10;
			  qunt=sum/10;
			  list.add(0,rem); 
			  list1_size--;
			  list2_size--;
		  }
		  else if(list1_size>=0)
		  {
			  int sum=arr[list1_size]+qunt;
			  int rem=sum%10;
			  qunt=sum/10;
			  list.add(0,rem);
			  list1_size--;
		  }
		  else if(list2_size>=0)
		  {
			  int sum=arrr[list2_size]+qunt;
			  int rem=sum%10;
			  qunt=sum/10;
			  list.add(0,rem);
			  list2_size--;
		  }
		
	  }
	  if(qunt>0)
	  {
		  list.add(0,qunt);
	  }
	  System.out.println(list);
  }
}
