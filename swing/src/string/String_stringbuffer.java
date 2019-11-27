package string;
import java.util.Scanner;
public class String_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StringBuffer s=new StringBuffer("hello");
s.append("face");
System.out.println(s);
//
StringBuffer b=new StringBuffer("hello ");
b.append("face");
System.out.println(b);
sc.close();
	}

}
