package Algo_Camp_DSA;

public class SetMatrix {
      public static void main(String[] args)

      {   
    	  int [][] num= {{5,0,3},
		           {9,4,6},
		           {2,8,3}};
			/*
			 * brutforceSetMatrix(num);
			 *  brutforceSetMatrix1(num);
			 */
    	  betterSolution(num);
    	  
      }

		
		  static void betterSolution(int [][] num) 
		  {
			  int row[]=new int[num.length]; 
			  int col[]= new int[num[0].length]; 
			  for(int i=0;i<num.length;i++) 
			  { 
				  for(int j=0;j<num[i].length;j++) 
				  { 
					  if(num[i][j]==0) 
					  { 
						  row[i]=1; col[j]=1; 
						  }
					  }
				  }
		   for(int i=0;i<num.length;i++) 
		   {
			   for(int j=0;j<num[i].length;j++) 
			   {
		      if(row[i]==1||col[j]==1) 
		      {
		    	  num[i][j]=0;
		    	  }
		      }
			   }
		   for(int i=0;i<num.length;i++) 
		   {
			  
		  for(int j=0;j<num[i].length;j++)
		  { 
			  System.out.print(num[i][j]+" "); 
		}
		  System.out.println();
		  }
		  
		  
		  
		  }
		 
    	 //brutforcesolution
			/*
			 * static void brutforceSetMatrix1(int [][]num) { for(int[] i:num) { for(int
			 * j:i) { System.out.print(j+" "); } System.out.println(); } } static void
			 * brutforceSetMatrix(int[][] num) { int m=num.length; int n=num[0].length;
			 * for(int i=0;i<num.length;i++) { for(int j=0;j<num[i].length;j++) {
			 * if(num[i][j]==0) { marker_row(num,i,m,n); marker_column(num,j,m,n); } } }
			 * for(int i=0;i<num.length;i++) { for(int j=0;j<num[i].length;j++) {
			 * if(num[i][j]==-1) { num[i][j]=0; } } }
			 * 
			 * 
			 * } static void marker_row(int[][] num,int i,int m,int n) { for(int
			 * k=0;k<m;k++) { if(num[i][k]!=0) { num[i][k]=-1; } } } static void
			 * marker_column(int[][] num,int j,int m,int n) { for(int k=0;k<n;k++) {
			 * if(num[k][j]!=0) { num[k][j]=-1; } } }
			 */
      
}
