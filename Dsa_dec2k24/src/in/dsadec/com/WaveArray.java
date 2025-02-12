package Algo_Camp_DSA;

public class WaveArray {
       public static void main(String[] args)
       {   
    	   int arr[] = {1,2,3,4,5};   //2 1 4 3 5
    	   int n = 5;
    	   waveArray(arr,n);
    	   
       }
       static void waveArray(int arr[],int n)
       {
    	   int nums[]=new int[n];
    	   for(int i=0;i<arr.length;i++) {
    		   if(i%2==0)
    		   {   if(i<n-1)
    			   nums[i]=arr[i+1]; //24
    		       if(i==n-1)
    		       nums[i]=arr[n-1];
    		   }
    		   if(i%2!=0)
    		   {
    			   nums[i]=arr[i-1]; //13
    		   }
    	   }
    	   int j=0;
    	   for(int i:nums)
    	   {
    		   arr[j++]=i;
    	   }
    	   for(int i:arr)
    	   {
    		   System.out.println(i);
    	   }
       }
}
