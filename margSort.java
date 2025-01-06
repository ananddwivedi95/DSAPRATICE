package in.dsadec.com;

public class margSort {
    public static void main(String[] args)
    {
        int arr[]={80 ,59, 26 ,46};
        int target=28;
        int ans[]=new int[2];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>target&&arr[i-1]<target)
            {
                ans[0]=arr[i-1];
                ans[1]=arr[i];
                System.out.print(ans[0]+" "+ans[1]);
            }
        }
    }
}
