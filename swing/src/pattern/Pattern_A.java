package pattern;
import java.util.Scanner;
public class Pattern_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=65;
int b=sc.nextInt();
for(int i=0;i<=b;i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print((char)(a+j)+" ");
	}
	System.out.println();
}
sc.close();
	}

}
