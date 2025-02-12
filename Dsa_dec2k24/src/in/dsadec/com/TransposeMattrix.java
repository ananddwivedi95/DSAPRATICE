package Algo_Camp_DSA;

public class TransposeMattrix {
       public static void main(String[] args)
       {
    	   int [][]nums= {{2,4,-1},
    			          {-10,5,11},
    			          {18,-7,6}
    	                   };
							/*
							 * int [][]nums_1=new int[3][3]; for(int i=0;i<nums.length;i++) { for(int
							 * j=0;j<nums[i].length;j++) { nums_1[j][i]=nums[i][j]; }
							 * 
							 * }
							 */
    	   for(int i=0;i<nums.length;i++)
    	   {
    		   for(int j=0;j<nums[i].length;j++)
    		   {  
    			   if(i>j)
    			   {
    			   int temp=nums[i][j];
    			   nums[i][j]=nums[j][i];
    			   nums[j][i]=temp;
    			   }
    		   }
    	   }
    	  for(int i=0;i<nums.length;i++)
    	  {
    		  for(int j=0;j<nums[i].length;j++)
    		  {
    			  System.out.print(nums[i][j]+" ");
    		  }
    		  System.out.println();
    		  
    	  }
    	  
       }
}
