package in.dsadec.com.TwoPointer;

public class TrappingRainWater {
    public static void main(String[] args)
    {
        int arr[]={3, 0, 1, 0, 4, 0 ,2};
        System.out.println(maxWater(arr));
    }
    static int maxWater(int a[]) {
    int sum=0;
    int l=0;
    int r=a.length-1;
    int leftMax=0;
    int rightMax=0;
    while(l<=r)
    {
        if(a[l]<=a[r])
        {
            if(a[l]>=leftMax)
            {
                leftMax=a[l];
            }
            else{
                sum=sum+(leftMax-a[l]);
            }
            l++;
        }
        else {
            if(a[r]>=rightMax)
            {
                rightMax=a[r];
            }
            else {
                sum=sum+(rightMax-a[r]);
            }
            r--;
        }
    }
    return sum;
    }
}
