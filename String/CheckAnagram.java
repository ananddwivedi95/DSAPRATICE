package in.dsadec.com.String;

import java.util.Arrays;
import java.util.Scanner;

//anagram means number of length of two string is same and occurrence (position and length) of char is same after sorting
public class CheckAnagram {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char []ch1=s1.toCharArray();
        Arrays.sort(ch1);
        char []ch2=s2.toCharArray();
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1, ch2)); //comparing both char array is equal or not
    }
}
