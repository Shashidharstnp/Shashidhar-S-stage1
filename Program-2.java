import java.util.Scanner;
public class two {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
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
