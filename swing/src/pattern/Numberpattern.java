package pattern;
import java.util.Scanner;
public class Numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row:");
int a=sc.nextInt();
int i=0,j=0,c;
for(i=1;i<=a;i++)
{
	c=0;
	for(j=1;j<=(2*i);j++)
	{
		System.out.print("*");
		c++;
		if(c==i)
		{
			System.out.printf(" ");
		}}
		System.out.println();
	
}
sc.close();
	}

}
