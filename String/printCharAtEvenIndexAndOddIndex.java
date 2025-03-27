package in.dsadec.com.String;

import java.util.Scanner;

public class printCharAtEvenIndexAndOddIndex {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string =sc.nextLine();
        System.out.println(string);
        //even index char print
        for(int i=0;i<string.length();i++)
        {
            if(i%2==0) {
                System.out.println("index " + i + " char " + string.charAt(i));
            }

        }
        //odd index char print
        for(int i=0;i<string.length();i++)
        {
            if(i%2!=0) {
                System.out.println("index " + i + " char " + string.charAt(i));
            }

        }
    }
}
