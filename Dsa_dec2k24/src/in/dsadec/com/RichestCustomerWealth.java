package in.dsadec.com;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		int arr[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		System.out.println(RichestCoustomer(arr));

	}

	static int RichestCoustomer(int arr[][]) {
		if (arr.length == 0) {
			return -1;
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			max = Math.max(max, sum);
		}
		return max;
	}

}
