package Algo_Camp_DSA;

public class TransposeMatrix {
       public static void main(String[] args)
       {
    	   int nums[][]= {{1,2,3},{4,5,6}};
    	   int update_matrix[][]=transposeMatrix(nums);
    	   for(int [] i:update_matrix)
    	   {
    		   for(int j:i)
    		   {
    			   System.out.print(j+" ");
    		   }
    		   System.out.println();  
    	   }
       }
       static int[][] transposeMatrix(int [][] nums)
       {
    	   int row=nums.length;
    	   int cols=nums[0].length;
    	   int [][] num_1=new int[cols][row];
    	   for(int i=0;i<nums.length;i++)
    	   {
    		   for(int j=0;j<nums[0].length;j++)
    		   {
    			   num_1[j][i]=nums[i][j];
    		   }
    	   }
			/*
			 * for(int [] i:num_1) { for(int j:i) { System.out.print(j+" "); }
			 * System.out.println(); }
			 */
    	   return num_1;
       }
}
