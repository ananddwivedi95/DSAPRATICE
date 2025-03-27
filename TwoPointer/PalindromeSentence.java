package in.dsadec.com.TwoPointer;

public class PalindromeSentence {
    public static void main(String[] args)
    {
        System.out.println(sentencePalindrome("Abc 012..## 10cbA"));
    }
    static boolean sentencePalindrome(String s) {
        // code here
        s=s.replaceAll("[^a-zA-Z0-9]",""); // replace all the space to non-space
        s=s.toLowerCase();  //convert all uppercase to lowercase
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
