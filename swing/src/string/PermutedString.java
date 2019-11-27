package string;
import java.util.Arrays;
import java.util.Scanner;
public class PermutedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the guest's name");
String a=sc.next();
System.out.println("Enter the residence host");
String b=sc.next();
System.out.println("Enter the letters in pile");
String c=sc.next();
String d=a.concat(b);
//System.out.println(d);
char fe[]=d.toCharArray();
Arrays.parallelSort(fe);

System.out.println(String.valueOf(fe));
a.toUpperCase();
b.toUpperCase();
if(d.equals(fe))
{
	System.out.println("Yes");
}
else
{
	System.out.println("No");
}

sc.close();
	}

}
