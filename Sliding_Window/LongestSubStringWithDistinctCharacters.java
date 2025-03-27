package in.dsadec.com.Sliding_Window;

import java.util.HashSet;

public class LongestSubStringWithDistinctCharacters {
    public static void main(String[] args)
    {
          System.out.println(subString( "geeksforgeeks"));
    }
    static int subString(String s)
    {
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        int right=0;
        int max=1;
        for(right=0;right<s.length();right++)
        {
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
           max=Math.max(max,right-left+1);
        }
        return max;
    }
}
