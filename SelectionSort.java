package in.dsadec.com;

public class SelectionSort {
    public static void main(String[] args)
    {
        int arr[]={5,4,3,2,1};
        selection(arr);
        print(arr);
    }
    static void print(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++)
        {
            int frist_Index=0+i;
            int min_Index=minElement(arr,frist_Index,arr.length-1);
            swap(arr,frist_Index,min_Index);
        }
    }
    static  void swap(int arr[],int last_Index,int max_Index)
    {
        int temp=arr[last_Index];
        arr[last_Index]=arr[max_Index];
        arr[max_Index]=temp;
    }
    static int minElement(int arr[],int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]>arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
