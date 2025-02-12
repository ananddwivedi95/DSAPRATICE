package Algo_Camp_DSA;

public class RunningSumOf1dArray {
       public static void main(String[] args)
       {
			/*
			 * int num[]= {1,2,3,4};
			 *  int num[]= {1,1,1,1,1};
			 */
    	   int num[]= {3,1,2,10,1};
    	  int nums_1[]= runningSumOf1dArray(num);
    	  for(int i:nums_1)
    	  {
    		  System.out.print(i+" ");
    	  }
       }
       static int[] runningSumOf1dArray(int num[])
       {
		  for(int i=0;i<num.length;i++)
		  {
			  if(i>0)
			  {
				  //int sum=num[i-1];
				  num[i]=num[i]+num[i-1];
			  }
		  }
		  return num;
       }
}
