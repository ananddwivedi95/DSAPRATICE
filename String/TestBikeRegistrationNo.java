package in.dsadec.com.String;

import java.util.Scanner;

public class TestBikeRegistrationNo {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println(string.matches("UP[0-9]{2}[A-Z]{2}[0-9]{4}")); // format type -> UP(compalisory) XX(RTO number 2 digit (00-99) ) XX(Alphabetic series 2 character(A-Z)) NNNN( 4 digit number (0-9))
    }
}
