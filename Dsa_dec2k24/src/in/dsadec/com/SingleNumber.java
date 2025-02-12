package Algo_Camp_DSA;

import java.util.HashMap;

public class SingleNumber {
     public static void main(String[] args)
     {
    	 int arr[]= {4,1,2,1,2};
    	int result= singleNumber(arr);
    	System.out.println(result);
     }
     /*static int singleNumber(int arr[])
     {
    	  int temp=0;
    	 for(int i=0;i<arr.length;i++)
    	 {     int count=0;
    	     
    		 for(int j=0;j<arr.length;j++)
    		 {
    			 if(arr[i]==arr[j])
    			 {
    				 count++;
    				 temp=arr[i];
    			 }
    		 }
    		 if(count==1)
    		 {
    			 return temp;
    		 }
    	 }
    	 return -1;
     }*/
   static int  singleNumber(int arr[])
     {
	   HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
	   for(int i=0;i<arr.length;i++)
	   {
		   if(hs.containsKey(arr[i]))
		   {
			   hs.put(arr[i], hs.get(arr[i])+1);
		   }
		   else
		   {
			   hs.put(arr[i], 1);
		   }
	   }
	   for(int k:hs.keySet())
	   {
		   if(hs.get(k)==1)
		   {
			   return k;
		   }
	   }
	   //System.out.println(hs);
    	 return 0;
     }
}
