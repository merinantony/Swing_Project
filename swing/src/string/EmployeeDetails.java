package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NAME");
		StringBuffer name=new StringBuffer(br.readLine());
		System.out.println("ENTER THE ID");
		StringBuffer id=new StringBuffer(br.readLine());
		System.out.println("ENTER THE AGE");
		StringBuffer age=new StringBuffer(br.readLine());
		System.out.println("ENTER THE ADDRESS");
		StringBuffer address=new StringBuffer(br.readLine());
		System.out.println("ENTER THE SALARY");
		StringBuffer salary=new StringBuffer(br.readLine());
		System.out.println("ENTER THE GENDER");
		StringBuffer gender=new StringBuffer(br.readLine());
		System.out.println("EMPLOYEE DETAILS");
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(address);
		System.out.println(salary);
		System.out.println(gender);
		}

		





	}


