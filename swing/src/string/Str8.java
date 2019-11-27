package string;
import java.util.Scanner;
public class Str8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StringBuffer s=new StringBuffer();
System.out.println("Enter the name");
s.append("Name -> "+sc.next()+"\n");
System.out.println("Enter the id number");
s.append(sc.next());
s.delete(0,5);

System.out.println(s);
s.replace(5,8, "Welcome");
System.out.println(s);
s.deleteCharAt(7);
System.out.println(s);

sc.close();
	}

}
