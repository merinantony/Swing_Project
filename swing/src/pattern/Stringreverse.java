package pattern;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=s.nextLine();
		String[] words=s1.split(" ");
		for(int i=0;i<words.length;i++)
		{
		if(i%2!=0)
		{
		int l=words[i].length();
		for(int j=l-1;j>=0;j--)
		{
		System.out.print(words[i].charAt(j));

		}
		System.out.print(" ");

		}
		else {
		System.out.print(words[i]+" ");
		}
		}

		
s.close();
		


	}

}
