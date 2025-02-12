package Algo_Camp_DSA;

public class FindInteger {
    public static void main(String[] args)
    {
 
    	int n=15;
    	int k=5;
   
    	int result=findInteger(n,k);
         System.out.println(result);
    }
    static int findInteger(int n,int k)
    {  
    	int even_Size=n/2;
    	int arr[]= new int[n];
 	   for(int i=0;i<arr.length;i++)
 	   {
 		   arr[i]=i+1;
 	   }
 	  int count=1;
	  for(int i=0;i<arr.length/2+1;i++)
	  {
		  arr[i]=count;
		  count+=2;
	  }
	  count=2;
	  for(int i=arr.length/2+1;i<arr.length;i++)
	  {
		  arr[i]=count;
		  count+=2;
	  }
	  for(int i:arr)
	  {
	  System.out.println(i);
	  }
	  int i=0;
 	   for(int ii:arr)
 	   {
 		   if(i++==k-1)
 		   {
 			   return ii;
 		   }
 	   }
 	   return 0;
    }
}
