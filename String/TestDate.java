package in.dsadec.com.String;

import java.util.Scanner;

public class TestDate {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(string.matches("[0123][0-9]-[01][0-9]-202[0-9]"));
    }
}
