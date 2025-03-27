package in.dsadec.com.Sorting;

public class MargeSort {
    public static void main(String[] args)
    {

        int arr[]={1,3,8,58,3,5,7,9};
        inversionCount(arr);
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }
    static void inversionCount(int arr[]) {
        // Your Code Here
        mergeSort(arr,0,arr.length-1);
    }
    static void mergeSort(int arr[],int start,int end) {
        int mid = start + (end - start) / 2;
        if (start >= end) {
            return ;
        }
        mergeSort(arr, start, mid); //left
        mergeSort(arr, mid + 1, end); //right
        merge(arr, start, mid, end);

    }
    static void merge(int arr[],int start,int mid,int end)
    {
        int left=start;
        int right=mid+1;
        int size=(end-start)+1;
        int newArr[]=new int[size];

        int index=0;

        while(left<=mid&&right<=end)
        {
            if(arr[left]<=arr[right])
            {
                newArr[index++]=arr[left++];
            }
            else {
                newArr[index++] = arr[right++];
            }
        }

        while(left<=mid)
        {
            newArr[index++]=arr[left++];
        }

        while(right<=end)
        {
            newArr[index++]=arr[right++];
        }

        for(int i=0;i<size;i++)
        {
            arr[start+i]=newArr[i];
        }

    }
}
