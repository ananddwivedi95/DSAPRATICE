package in.dsadec.com.String;

import java.util.Scanner;

public class TestGmail {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(string.matches("[a-z][a-z0-9_][a-z0-9_]+@gmail[.]com"));
    }
}
