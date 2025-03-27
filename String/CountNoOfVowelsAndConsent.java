package in.dsadec.com.String;

import java.util.Scanner;

public class CountNoOfVowelsAndConsent {
    public static void main(String[] args)
    {
        int count_Vowels=0;
        int count_Consent=0;
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        //for vowels char
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
               count_Vowels++;
            }
        }
        System.out.println(count_Vowels+"");
        //for consent char
        int count=0;
        for(int i=0;i<string.length();i++)
        { count++;
            char ch=string.charAt(i);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
                count_Consent++;
            }
        }
        System.out.println(count_Consent+"");
        System.out.println("total no latter "+count);
    }
}
