package pattern;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,k;
for(i=0;i<n;i++)
{
	for(j=0;j<i;i++)
	{
		for(k=0;k<j-1;k++)
		{
			System.out.print(" ");
		}
		System.out.print("* ");
	}
	System.out.print("");
}
sc.close();
	}

}
