package in.dsadec.com;

public class FindNumberswithEvenNumberofDigits {

	public static void main(String[] args) {
		int arr[]= {555,901,482,1771};
		System.out.println(FindNumberWithEvenNumber(arr));
	}
	static int FindNumberWithEvenNumber(int arr[])
	{
		if(arr.length==0)
		{
			return -1;
		}
		int even_count=0;
		for(int i=0;i<arr.length;i++)
		{
			String str=String.valueOf(arr[i]);
			if(str.length()%2==0)
			{
				even_count++;
			}
			
		}
		return even_count;
		
		
	}

}
