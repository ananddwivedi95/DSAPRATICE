package Algo_Camp_DSA;


import java.util.ArrayList;

public class AddToArrayFormOfInteger {
     public static void main(String[] args)
     {
    	 int[] num = {2,7,4};
    	 int k = 181;
    	 System.out.println(addToArray(num,k));
     }
     public static ArrayList<Integer> addToArray(int nums[],int k)
     {
			/*
			 * ArrayList<Integer> arr= new ArrayList(); int rem_k=0; while(k!=0) {
			 * rem_k=k%10; arr.add(0,rem_k); k=k/10; } Object[] obja_1=arr.toArray(); int
			 * nums_1[]=new int[obja_1.length]; for(int i=0;i<nums_1.length;i++) {
			 * nums_1[i]=(int)obja_1[i]; }
			 */
       
       int carry=0;
       int i=nums.length-1;
      // int j=nums_1.length-1;
       ArrayList<Integer> arr_1=new ArrayList<Integer>();
       while(i>=0||k>0||carry>0)
       {
    	   int sum=0;
    	   sum+=carry;
    	   if(i>=0)
    	   {
    		   sum+=nums[i];
    	   }
    	   if(k>=0)
    	   {
    		  sum+=k%10;
    		  k=k/10;
    	   }
    	   int rem=sum%10;
    	   carry=sum/10;
    	   arr_1.add(0,rem);
    	   i--;

       }
       System.out.println(arr_1);
       
	return arr_1;
     }
}
