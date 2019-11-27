package string;
import java.util.Scanner;
public class Casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StringBuffer s=new StringBuffer();
System.out.println("Enter your choice");
System.out.println("1)car\n2)Bike");
int n=sc.nextInt();
switch(n)
{
case 1:
	System.out.println("Enter the details of car:");
	System.out.println("Enter the colour");
	s.append("colour       : "+sc.next()+"\n");
	System.out.println("Enter the maximum speed");
	s.append("maximum speed: "+sc.next()+"\n");
	System.out.println("Enter the number of seat");
	s.append("seat         : "+sc.next()+"\n");
	System.out.println("Enter the number of wheel");
	s.append("Wheel        : "+sc.next()+"\n");
	System.out.println("Enter the number of door");
	s.append("Door         : "+sc.next()+"\n");
	System.out.println("Enter the status of AC(true/false)");
	s.append("status       : "+sc.next()+"\n");
	System.out.println(s);
	break;
case 2:
	System.out.println("Enter the details of bike:");
	System.out.println("Enter the colour");
	s.append("colour            : "+sc.next()+"\n");
	System.out.println("Enter the maximum speed");
	s.append("maximum speed     : "+sc.next()+"\n");
	System.out.println("Enter the number of seat");
	s.append("seat              : "+sc.next()+"\n");
	System.out.println("Enter the number of wheel");
	s.append("Wheel             : "+sc.next()+"\n");
	System.out.println("Enter the status of disk break(true/false)");
	s.append("status            : "+sc.next()+"\n");
	System.out.println(s);
	break;
default:
	System.out.println("invalid input");
}
sc.close();
	}

}
