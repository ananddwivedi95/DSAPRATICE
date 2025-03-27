package in.dsadec.com.String;

public class StringSCPTest {
    public static void main(String[] args)
    {
        String s=new String("anand");
        s.concat(" Dwivedi"); // new String object is created but not modify because of immutability old one and not initalize   it
        s=s.concat(" Dwivedi");// new String object is created and reference with s pointer
        System.out.println(s);
        StringBuffer name=new StringBuffer("anand");
        name.append(" Dwivedi");// new object is not created because of StringBuffer and StringBuilder is mutable
        System.out.println(name);
        String s1= new String("anand");
        String s2= new String("anand");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //object1.equals(object2) -> it is override in the java.lang.String package
        //mainly t=it is used for content comparision in string

        //but
        //.equals() -> is not override in the java.lang.StringBuffer package so here it is used as previous it is use for object refference/ address camparision
        StringBuffer sb1 = new StringBuffer("anand");
        StringBuffer sb2 = new StringBuffer("anand");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));


    }
}
