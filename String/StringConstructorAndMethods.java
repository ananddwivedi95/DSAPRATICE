package in.dsadec.com.String;

import java.util.Arrays;

public class StringConstructorAndMethods {
    public static void main(String[] args)
    {
        String s=new String(); //empty String object
        String s1=new String("anand");
        System.out.println(s1);
        System.out.println(s1.length()); //length method in String used for calculating length of String
        System.out.println(s1.isEmpty());//method for check it is empty ir not
        char ch[]={'a','n','a','n','d'};
        String s2=new String(ch);
        System.out.println(s2);
        String s3=new String(ch,1,4);
        System.out.println(s3);
        StringBuffer sb= new StringBuffer("abc");
        String s4=new String(sb);
        s4.concat("cde");
        sb.append("cde");
        System.out.println(sb);
        System.out.println("anand Dwivedi".length());

        System.out.println(s4.startsWith("a")); // method is checks the string startWith
        System.out.println(s4.endsWith("c"));  //method is checks the method is endWith

        String s5= new String("anand");
        String s6=new String("anand");
        System.out.println(s5.equals(s6)); //equals() method is override in java.lang.String it is used for content comparing not for reference and content

        StringBuffer sb2= new StringBuffer("anand");
        StringBuffer sb3=new StringBuffer("anand");
        System.out.print(sb2.equals(sb3)); //equals() method is not override in java.lang.StingBuffer hence it is used for reference (address)  comparing not for content comparing for StringBuffer

        String s7="anand";
        System.out.println(s7.charAt(0));
        System.out.println(s7.charAt(1));
        System.out.println(s7.charAt(2));
        System.out.println(s7.charAt(3));
        System.out.println(s7.charAt(1)); //this method is return the char at the given index in the String

        String s8="anand";
        System.out.println(s8.indexOf("a"));
        System.out.println(s8.indexOf("n"));
        System.out.println(s8.indexOf("a"));
        System.out.println(s8.indexOf("n"));
        System.out.println(s8.indexOf("d")); // this method is used to return the index value of given String but it gives only index of first occurence of character

        System.out.println(s8.lastIndexOf("a"));
        System.out.println(s8.lastIndexOf("n"));
        System.out.println(s8.lastIndexOf("a"));
        System.out.println(s8.lastIndexOf("n"));
        System.out.println(s8.lastIndexOf("d"));  //this method is return the index of last present index of that particular String

        String s9="my name is Anand Dwivedi";
        System.out.println(s9.substring(0));
        System.out.println(s9.substring(3));
        System.out.println(s9.substring(8));
        System.out.println(s9.substring(11));
        System.out.println(s9.substring(17)); // this method id return the String from given index till end-1 index

        System.out.println(s9.substring(11,24)); // print the SubString form 17 index till 24-1 index

        String s10="Dwivedi";
        System.out.println(s8.concat(s10));  //this method id used for concatination purpose we can also use "+" operator for this operation
        System.out.println(s8+s10);

        String s11="anand Dwivedi";
        System.out.println(s11.replace("a","aa")); // this method is used to replace the old character to new character

        String s12="anand Dwivedi";
        System.out.println(s12.toUpperCase()); // this method is used to convert the string in uppercase if it is also uppercase then will aso convert it in uppercase
        System.out.println(s12.toLowerCase()); //this method is used to convert the String into lowercase if it is already lowercase then also convert in lowercase

        String s13="Anand Dwivedi Java Developer Engineer";
        String[] string=s13.split(" ");
        System.out.println(Arrays.toString(string)); //this method is used to split the string into split format


    }
}
