package in.dsadec.com.Sliding_Window;

public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args)
    {
      System.out.println(numberOfSubstrings("abcabc"));
    }
    static int numberOfSubstrings(String s) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int[] freq = new int[3];
        int result = 0;
        System.out.println("finish");
        while (j < n) {
            freq[s.charAt(j) - 'a']++; // Expand the window
            j++;

            // When all characters ('a', 'b', 'c') are in the window
            while (allNonZero(freq)) {
                result += (n - j + 1); // Count valid substrings
                freq[s.charAt(i) - 'a']--; // Shrink the window
                i++; // Move left pointer forward
            }


        }
        return result;
    }
    static boolean allNonZero(int[] freq) {
        for (int count : freq) {
            if (count <= 0) {
                return false;
            }
        }
        return true;
    }
}
