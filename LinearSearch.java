package in.dsadec.com;

public class LinearSearch {
  public static void main(String [] args)
  {
	  int arr[]= {1,2,3,5,5556,67,79,7,5,78,6};
	  int result=Linear(arr,5);
	  System.out.println(result);
  }
  static int Linear(int arr[],int target)
  {
	  if(arr.length==0)
	  {
		  return -1;
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		 if(arr[i]==target)
		 {
			 return i;
		 }
	  }
	  return -1;
  }
}
