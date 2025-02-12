package Algo_Camp_DSA;

public class NextGreaterElement {
    public static void main(String[] args)
    {
    	int arr[]= {5 ,4 ,3 ,2, 1};
    	nextGraterElement(arr);
    }
    static void nextGraterElement(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i;j<arr.length;j++)
    		{
    			if(arr[j]>arr[i])
    			{
    				arr[i]=arr[j];
    				break;
    			}
    			else if(j==arr.length-1)
    			{
    				arr[i]=-1;
    			}
    		}
    	}
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
}
