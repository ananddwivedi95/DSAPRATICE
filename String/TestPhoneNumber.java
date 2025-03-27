package in.dsadec.com.String;

import java.util.Scanner;

public class TestPhoneNumber {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String pin=sc.nextLine();
        System.out.println(pin.matches("[6-9][0-9]{9}")); //format type 1st character[6-9]then rest->[0-9]for->9times

    }
}
