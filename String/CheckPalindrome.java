package in.dsadec.com.String;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        StringBuffer sb=new StringBuffer(string);
        sb.reverse();
        System.out.println(string.equals(sb.toString()));
    }
}
