import java.util.Scanner;
public class Three {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==0)
		{
			a=a-1;
		}
		int count=1;
		int i=1;
		while(count<=a)
		{
			if(i%2!=0)
			{
				System.out.print(i+",");
				count++;
			}
			i++;
		}
	}
}
