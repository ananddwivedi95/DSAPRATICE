package in.dsadec.com.String;

import java.util.Scanner;

public class TestUnivercityRollNo {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(string.matches("DS[0-9]{4}2025")); //format type of roll no -> DS[0-9]4timethen2025
    }
}
