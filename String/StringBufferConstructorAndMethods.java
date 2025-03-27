package in.dsadec.com.String;

public class StringBufferConstructorAndMethods {
    public static void main(String[] args)
    {
        StringBuffer sb= new StringBuffer("anand");
        System.out.println(sb);
        sb.append("dwivedi");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // this method return maximum capacity of StringBuffer is (anand) 5+16(default capacity)= 21 return 21;

        StringBuffer sb1= new StringBuffer(50);
        System.out.println(sb1.capacity()); // here we are creating a StringBuffer with desired capacity as per need

        System.out.println(sb.length());// this method is used to return length of StringBuffer it includes the space

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());//this method is used to extend the capacity of StringBuffer

        sb.setLength(20);
        System.out.println(sb.length()); // this method is used to set the length

        StringBuffer sb2=new StringBuffer("anand   Dwivedi");
        sb2.setCharAt(1,'a');
        sb2.setCharAt(2,'n');
        System.out.println(sb2); //this method is used to replace character with the help of index number

        sb2.insert(0,"ER ");
        System.out.println(sb2); //this method is used to insert the character at a given index location

        sb2.delete(8,10);
        System.out.println(sb2); // this method is used to delete the character between start index to end index

        StringBuffer sb3= new StringBuffer("abc");
        sb3.reverse();
        System.out.println(sb3); //this method is used to reverse the StringBuffer content

        
    }
}
