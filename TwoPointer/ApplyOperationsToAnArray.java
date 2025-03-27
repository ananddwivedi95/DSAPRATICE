package in.dsadec.com.TwoPointer;

public class ApplyOperationsToAnArray {
    public static void main(String[] args)
    {
        int arr[]={1,2,2,1,1,0};
        operationOnArrays(arr);
    }
    static void operationOnArrays(int[] arr)
    {
        int i=0;
        while(i<arr.length-1) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
                i++;
            } else {
                i++;
            }
        }
        int ii=0;
        int jj=0;
        while(ii<arr.length)
        {
            if(arr[ii]!=0)
            {
                swap(ii,jj,arr);
                jj++;
            }
            ii++;
        }
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    static void swap(int i,int j ,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
