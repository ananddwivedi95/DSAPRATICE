package in.dsadec.com.String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args)
    {
        System.out.println(nonRepeatingChar("geeksforgeeks"));
    }
    static char nonRepeatingChar(String s) {
        // Your code here
        HashMap<Character,Integer> hs= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1); // getOrDefault method is used to check whether the key is present or not if not present then initialize with key any value initialize by default 0 and increment by 1 otherwise if present then simply increment by 1
        }
        for(int i=0;i<s.length();i++)
        {
            if(hs.get(s.charAt(i))==1)
            {
                return s.charAt(i);
            }
        }
        return '$';
    }
}
