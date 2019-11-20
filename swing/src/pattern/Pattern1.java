package pattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int i,j;
int n=sc.nextInt();
for(i=0;i<n;i++)
{
	for(j=0;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println("");
}
sc.close();
	}

}
