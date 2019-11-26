package pattern;
import java.util.Scanner;
public class Number011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row:");
int a=sc.nextInt();int j=0;
for(int i=0;i<a;i++)
{
	for( j=0;j<a;j++)
	{
	if(i==j)
	{
		System.out.print("0");
	}
	else {
		System.out.printf("%d",i+1);}
	}
	System.out.println();
	}
sc.close();
}
	}


