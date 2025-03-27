package in.dsadec.com.String;
import java.util.*;
public class TestATMPin {
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       String pin=sc.nextLine();
       System.out.println(pin.matches("[0-9]{4}"));

    }
}
