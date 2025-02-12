package Scaler_academy_DSA;

public class Sum0SubArray {
     public static void main(String[] args)
     {
    	 int arr[]= {2,4,-3,1,3,-2,1,-5,7,2};
    	int new_arr[]= SumOf0SubArray.subArray(arr);
    	System.out.println(new_arr[0]+" "+new_arr[1]);
     }
}

 class SumOf0SubArray
 {
	static int[]  subArray(int arr[]){
		
		 int []arr_1=new int[2];
		 for(int i=0;i<arr.length;i++)
		 {
			 int sum=0;
			 for(int j=i;j<arr.length;j++)
			 {
				 
				 if((sum+=arr[j])==0)
				 { 
					arr_1[0]=i;
					arr_1[1]=j;
					return arr_1;
				 }
			 }
		 }
		return arr_1;
	 }
 }
