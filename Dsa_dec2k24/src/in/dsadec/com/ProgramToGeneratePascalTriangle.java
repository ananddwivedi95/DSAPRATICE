package Algo_Camp_DSA;

public class ProgramToGeneratePascalTriangle {
   public static void main(String[] args)
   {
	  int result= pascalsTriangle(5);
	  System.out.println(result);
   }
   public static int pascalsTriangle(int n)
   {   
	   int number;
	   for(int i=0;i<n;i++)
	   {   
		   for(int space_i=n;space_i>=i;space_i--)
		   {
			   System.out.print(" ");
		   }
		   number=1;
		   for(int j=0;j<=i;j++)
		   {  
			   System.out.print(number+" ");
			   number=number*(i-j)/(j+1);
			   
		   }
		  System.out.println();  
   }
	    return 0;
}
}
