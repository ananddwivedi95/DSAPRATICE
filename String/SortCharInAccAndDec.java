package in.dsadec.com.String;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharInAccAndDec {
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       String string=sc.nextLine();
       char ch[]=string.toCharArray();
       Arrays.sort(ch);
       System.out.println(new String(ch));
    }
}
