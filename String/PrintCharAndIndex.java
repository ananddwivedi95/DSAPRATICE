package in.dsadec.com.String;

import java.util.Scanner;

public class PrintCharAndIndex {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string =sc.nextLine();
        System.out.println(string);
        for(int i=0;i<string.length();i++)
        {
            System.out.println("index "+i+" char "+string.charAt(i));
        }
    }
}
