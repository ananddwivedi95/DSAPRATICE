package in.dsadec.com;

public class LinearsearchMaxMin {
	public static void main(String [] args)
	  {
		  int arr[]= {1,2,3,5,5556,67,79,7,5,78,6};
		  int result=LinearMax(arr);
		  System.out.println(result);
		 
		  System.out.println(LinearMin(arr ));
	  }
	  static int LinearMax(int arr[])
	  {
		 int max=Integer.MIN_VALUE;
		 if(arr.length==0)
		 {
			 return -1;
		 }
		  for(int i=0;i<arr.length;i++)
		  {
			 if(arr[i]>max)
			 {
				 max=Math.max(max, arr[i]);
			 }
		  }
		  return max;
	  }
	  static int LinearMin(int arr[])
	  {
		 int min=Integer.MAX_VALUE;
		 if(arr.length==0)
		 {
			 return -1;
		 }
		  for(int i=0;i<arr.length;i++)
		  {
			 if(arr[i]<min)
			 {
				 min=Math.min(min, arr[i]);
			 }
		  }
		  return min;
	  }
}
