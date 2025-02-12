package Algo_Camp_DSA;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args)
    {
    	int arr[]= {3,1,-2,-5,2,-4};
    	RearrangeArrayElement.rearrangeArrayElement(arr);
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]+" ");
    	}
    }
      
}
class RearrangeArrayElement
{   
	/*static void rearrangeArrayElement(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
	   int positive_Size=count;
	   int negative_Size=arr.length-count;
	   int arr_positive[]= new int[positive_Size];
	   int arr_negative[]=new int[negative_Size];
	   int index_Positive=0;
	   int index_Negative=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]>0)
		   {
			   arr_positive[index_Positive++]=arr[i];
		   }
		   else
		   {
			arr_negative[index_Negative++]=arr[i];   
		   }
	   }
	    index_Positive=0;
	    index_Negative=0;
	
	   
		   for(int i=0;i<arr.length;i++)
		   {
			   if(i%2==0)
			   {
				   arr[i]=arr_positive[index_Positive++];
			   }
			   else
			   {
				   arr[i]=arr_negative[index_Negative++];
			   }
		   }
	   
	}*/
	static void rearrangeArrayElement(int arr[])
	{
		int index_Positive=0;
		int index_Negative=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0&&index_Positive < arr.length)
			{
				arr[index_Positive]=arr[i];
				index_Positive=index_Positive+2;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0&&index_Negative < arr.length)
			{
				arr[index_Negative]=arr[i];
				index_Negative=index_Negative+2;
			}
		}
		
	}
}

