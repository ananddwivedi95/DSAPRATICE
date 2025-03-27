package in.dsadec.com.String;

import java.util.Scanner;

public class PrintVowelsAndConsentChar {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        //for vowels char
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                System.out.print(ch + " ");
            }
        }
        System.out.println("");
        //for consent char
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
                System.out.print(ch + " ");
            }
        }
    }
}
