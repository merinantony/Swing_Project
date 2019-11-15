package interviewquestions;
import java.util.Scanner;
public class Reverse_string {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	String str;
	Scanner scanner = new Scanner(System.in);
	str = scanner.nextLine();
	scanner.close();
	String reversed = reverseString(str);
	System.out.println("The reversed string is: " + reversed);
	s.close();
	}
	public static String reverseString(String str) {
	if (str.isEmpty())
	return str;
	// Calling Function Recursively
	return reverseString(str.substring(1)) + str.charAt(0);
	
	}
	}

