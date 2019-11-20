package pattern;
import java.util.Scanner;
public class HalfpyramidString {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 String s = sc.next();
	 int length = s.length();
	 char[] a = s.toCharArray();
	  for (int i = 0; i < length; i++) 
	   {
	 for (int j = 0; j <= i; j++)
	 {
	  System.out.print(a[j]+" ");
	  }
	 System.out.println();
	 }
	  sc.close();
 }
	   

}
