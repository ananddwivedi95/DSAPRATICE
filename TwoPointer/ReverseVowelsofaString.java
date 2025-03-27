package in.dsadec.com.TwoPointer;

import java.util.Set;

public class ReverseVowelsofaString {
    public static void main(String[] args)
    {
        String string="leetcode";
        char[] ch=string.toCharArray();
        System.out.println(reverseVowels(string,ch));

    }
    static String reverseVowels(String s,char[] ch) {
        int i=0;
        int j=s.length()-1;
       Set<Character> vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
        while(i<j)
        {
            if(vowels.contains(s.charAt(i))&&vowels.contains(s.charAt(j)))
            {
                    swap(i,j,s,ch);
                    i++;
                    j--;
            }
            else if(vowels.contains(s.charAt(i))&&(!vowels.contains(s.charAt(j))))
            {
                j--;
            }
            else if(!(vowels.contains(s.charAt(i)))&&(vowels.contains(s.charAt(j))))
            {
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        return new String(ch);
    }
    static void swap(int i,int j,String s,char[] ch)
    {
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}
