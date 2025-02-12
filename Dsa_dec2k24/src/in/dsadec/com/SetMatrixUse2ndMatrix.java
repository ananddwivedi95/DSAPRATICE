package Algo_Camp_DSA;

public class SetMatrixUse2ndMatrix {
   public static void main(String[] args)
   {
	   int [][] num= {{5,0,3},
			           {9,4,6},
			           {2,8,3}};
	      setMatrixOptimalSolution(num);
   }
   static void  setMatrixOptimalSolution(int[][] arr)
   {
	   int col0=1;
       int m=arr.length;
       int n=arr[0].length;
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(arr[i][j]==0)
               {
                   arr[i][0]=0;
                   if(j!=0)
                   {
                       arr[0][j]=0;
                   }
                   else
                   {
                       col0=0;
                   }
               }
           }
       }
       for(int i=1;i<m;i++)
       {
           for(int j=1;j<n;j++)
           { 
           	if(arr[i][j]!=0)
           	{
               if(arr[i][0]==0||arr[0][j]==0)
               {
                   arr[i][j]=0;
               }
           	}
           }
       }
       if(arr[0][0]==0)
       {
           for(int i=0;i<n;i++)
           {
               arr[0][i]=0;
           }
       }
       if(col0==0)
       {
           for(int i=0;i<n;i++)
           {
               arr[i][0]=0;
           }
       }
       for(int i=0;i<arr.length;i++)
       {
       	for(int j=0;j<arr[0].length;j++)
       	{
       		System.out.print(arr[i][j]+" ");
       	}
       	System.out.println();
       }
		       
		    }
   
	/*
	 * static void setMatrix(int[][] num) { int [][]num_s=new
	 * int[num.length][num[0].length]; for(int i=0;i<num.length;i++) { for(int
	 * j=0;j<num[i].length;j++) { num_s[i][j]=num[i][j]; } } for(int
	 * i=0;i<num_s.length;i++) { for(int j=0;j<num_s[i].length;j++) {
	 * if(num_s[i][j]==0) { int m=i; int n=j; for(int k=0;k<num_s[i].length;k++) {
	 * num[m][k]=0; } for(int k=0;k<num_s.length;k++) { num[k][n]=0; } } }
	 * 
	 * } for(int i=0;i<num.length;i++) { for(int j=0;j<num[i].length;j++) {
	 * System.out.print(num[i][j]+" "); } System.out.println(); } }
	 */
}
