package in.dsadec.com;

public class NumberofOccurrence {
    public static void main(String[] args) {
        int arr[] = {8, 9, 10, 12, 12, 12};
        System.out.println(solution(arr, 12));

    }

    static int solution(int arr[], int target)
        {
            // code here
            int count = 0;
            if (arr[arr.length - 1] < target) {
                return 0;
            }
            if (arr[0] == target) {
                for (int i = 0; i <= arr.length - 1; i++) {
                    if (arr[i] != target) {
                        return count;
                    } else {

                        count++;
                    }
                }
            }
            //System.out.println("executed 1");
            int start = 0;
            int end = arr.length - 1;
            int current_PositionIndex = -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    current_PositionIndex = mid;
                    break;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                }
            }
            //System.out.println(current_PositionIndex);
            int required_Index = 0;
            if (current_PositionIndex == -1) {
                return 0;
            }

            //System.out.println(current_PositionIndex);
            //System.out.println(target);
            if (arr[current_PositionIndex] > arr[current_PositionIndex - 1]) {
                for (int i = current_PositionIndex; i <= arr.length - 1; i++) {
                    if (arr[i] != target) {
                        return count;
                    } else {

                        count++;
                    }
                }


            }
            for (int i = current_PositionIndex; i >= 0; i--) {
                if (i > 0 && arr[i] == arr[i - 1]) {
                    required_Index = i - 1;
                } else {
                    break;
                }
            }
            //System.out.println(required_Index);

            for (int i = required_Index; i <= arr.length - 1; i++) {
                if (arr[i] != target) {
                    break;
                } else {
                    count++;
                }
            }

            return count;
    }
}
