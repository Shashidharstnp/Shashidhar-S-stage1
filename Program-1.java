package tandem;

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of a");
		double a=scan.nextDouble();
		System.out.println("enter the value of b");
		double b=scan.nextDouble();
		System.out.println("enter type of operation add,sub,mul or div");
		String c=scan.next();
		if(c.equalsIgnoreCase("add"))
		{
			System.out.println("addition result is "+(a+b));
		}
		else if(c.equalsIgnoreCase("Sub"))
		{
			System.out.println("Substraction result is "+(a-b));
		}
		else if(c.equalsIgnoreCase("Mul"))
		{
			System.out.println("multiplication result is "+(a*b));
		}
		else if(c.equalsIgnoreCase("Div"))
		{
			System.out.println("Division result is "+(a/b));
		}
		else 
		{
			System.out.println("invalid operation");
		}
	}
}

