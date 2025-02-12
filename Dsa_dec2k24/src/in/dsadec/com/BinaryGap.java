package Algo_Camp_DSA;

import java.util.ArrayList;

public class BinaryGap {
   public static void main(String[] args)
   {
	   int num=9;
	  int result= binaryGap(num);
	  System.out.println(result);
   }
   static int binaryGap(int num)
   {
	   ArrayList<Integer> ar= new ArrayList<Integer>();
	   int bin=0;
	   while(num!=0)
	   {
		   bin=num%2;
		   num/=2;
		   ar.add(0,bin);
	   }
	   ArrayList<Integer> arr= new ArrayList<Integer>();
	   for(int i=0;i<ar.size();i++)
	   {
		   if(ar.get(i)==1)
		   {
		   arr.add(i);
		   }
	   }
	   if(arr.size()==1)
	   {
		   return 1;
	   }
	   int max=Integer.MIN_VALUE;
	   for(int i=1;i<arr.size();i++)
	   {
			   max=Math.max(max, arr.get(i)-arr.get(i-1));
	   }
	  return max;
   }
}
