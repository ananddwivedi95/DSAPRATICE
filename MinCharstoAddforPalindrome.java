package in.dsadec.com.String;

public interface MinCharstoAddforPalindrome {
    public static void main(String[] args)
    {
        System.out.println(minChar("aacecaaaa"));
    }
    public static int minChar(String s) {
        // Write your code here

        int n=s.length();
       String rev= new StringBuilder(s).reverse().toString();
       s=s+"$"+rev;
       int [] lps= new int[s.length()];
       return n-lps(lps,s);
    }
    static int lps(int [] lps,String string)
    {
        int p=0;
        int s=1;
        while(s<string.length())
        {
            if(string.charAt(s)==string.charAt(p))
            {
                lps[s]=p+1;
                s++;
                p++;
            }
            else {
                if(p==0)
                {
                    lps[s]=0;
                    s++;
                }
                else {
                    p=lps[p-1];
                }
            }
        }
        return lps[lps.length-1];
    }
}
