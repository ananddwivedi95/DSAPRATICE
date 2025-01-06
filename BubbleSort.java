package in.dsadec.com;

public class BubbleSort {
    public static void main(String[] args)
    {
        int arr[]={5,4,8,4,1};
        bubble(arr);
        print(arr);
    }
    static void print(int arr[]) {
       for(int i:arr)
       {
           System.out.print(i+" ");

       }
    }
    static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }

    }
    static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
