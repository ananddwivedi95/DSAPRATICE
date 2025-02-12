package Algo_Camp_DSA;

public class RotateImage {
     public static void main(String[] args)
     {
    	 int [][] arr={{1,2,3,},
    			        {4,5,6},
    			        {7,8,9}
    			       };
    	 Rotate.rotateImage(arr);
     }
}
class Rotate
{
	static void rotateImage(int [][] arr)
	{  //transpose 
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{  int temp=0;
				if(i>j)
				{
					temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		//reverse in place 
		for(int i=0;i<n;i++)
		{
			int temp=0;
			for(int j=0;j<n/2;j++)
			{  
					temp=arr[i][j];
					arr[i][j]=arr[i][(n-1)-j];
					arr[i][(n-1)-j]=temp;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	  
	}
}
//brute force approch
/*
 * class Rotate { static void rotateImage(int [][] arr) { int n=arr.length; int
 * m=arr[0].length; int [][] arr_1=new int[n][m]; for(int i=0;i<n;i++) { for(int
 * j=0;j<m;j++) { arr_1[j][(n-1)-i]=arr[i][j]; } } for(int i=0;i<n;i++) {
 * for(int j=0;j<m;j++) { System.out.print(arr_1[i][j]+" "); }
 * System.out.println(); } }
 * 
 * }
 */