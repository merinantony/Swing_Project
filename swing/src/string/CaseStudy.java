package string;

import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Registration");
		System.out.println("Enter the name");
		s.append("Name           : "+sc.next()+"\n");
		System.out.println("Enter your address");
		s.append("Address        : "+sc.next()+"\n");
		System.out.println("Enter your contact number");
		s.append("Contact Number : "+sc.next()+"\n");
		System.out.println("Enter your email id");
		s.append("Email          : "+sc.next()+"\n");
		System.out.println("Enter your proof type");
		s.append("Proof Type     : "+sc.next()+"\n");
		System.out.println("Enter your proof id");
		s.append("Proof id       : "+sc.next()+"\n");
		//System.out.println(s);
		System.out.println("Thanks for registering");
		System.out.println("Do you want to continue registration (y/n)");
		String m=sc.nextLine();
		if(m=="N"||m=="n")
		{
			System.out.println("Do you want to update the email?(y/n)");	
			System.out.println("Update Email");
		}
		System.out.println("Your details are as follows");
		System.out.println(s);
		sc.close();
	}

}
