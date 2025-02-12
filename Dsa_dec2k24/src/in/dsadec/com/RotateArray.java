package Algo_Camp_DSA;

public class RotateArray {
    public static void main(String[] args)
    {
		
		 int [] arr = {1,2,3,4,5,6,7}; int k = 3; 
		 
    	
		
		/*
		 * int [] arr= {1,2,3,4,5}; int k=5;
		 */
		 
       RotationArray.rotateArray(arr,k);
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
       
    }
    
}
//bruteforce_Solution
/*class RotationArray

{
	static void rotateArray(int arr[],int k)
	{
		int arr_1[]= new int[arr.length];
		int rotation=k%arr.length;
		while(rotation>=1)
		{
			int j=0;
			for(int i=1;i<arr.length;i++)
			{
				arr_1[i]=arr[j++];
			}
			arr_1[0]=arr[arr.length-1];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=arr_1[i];
			}
			rotation--;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}*/
//better_Solution
/*class RotationArray
{
	static void rotateArray(int arr[],int k)

	{
		int temp[]= new int[arr.length];
		int rotation_count=k%arr.length;
		int index_start=arr.length-rotation_count;
		int j=0;
		for(int i=index_start;i<arr.length;i++)
		{
			temp[j++]=arr[i];
		}
		j=0;
		for(int i=rotation_count;i<arr.length;i++)
		{
			temp[i]=arr[j++];
		}
		for(int i:temp)
		{
			System.out.println(i);
		}

	}
		
	}*/
//optimal_Solution
class RotationArray
{
	static void rotateArray(int arr[],int k)
	{
		int rotation_count=k%arr.length;
		reverse(arr,0,arr.length-1);
		
		reverse(arr,0,rotation_count-1);
		
		reverse(arr,rotation_count,arr.length-1);
		
	}
	static void reverse(int []arr,int left,int right)
	{
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}
}
