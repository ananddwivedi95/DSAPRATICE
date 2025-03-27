package in.dsadec.com.String;

import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class StringTokenizerConstructorAndMethods {
    public static void main(String[] args)
    {

        StringTokenizer st= new StringTokenizer("4/1/20255","/");

        System.out.println(st.countTokens()); // this method is return how ma y tokens present in StringTokenizer
        while ((st.hasMoreTokens()))
        {
            System.out.print(st.nextToken()+" ");
        }
    }
}
