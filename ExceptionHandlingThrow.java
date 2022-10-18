package Revision;
import java.util.Scanner;

class Age extends RuntimeException
{
	Age(String msg)
	{
		System.out.println(msg);
		//super(msg);
	}
}
public class ExceptionHandlingThrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country");
		String str=sc.next();
		String str1="india";
		str=str.toLowerCase();
		// TODO Auto-generated method stub
		try {
			if(str.equals(str1))
			{
				System.out.println("Indian");
			}
			else
			{
				throw new Age("not indian");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		System.out.println("done with your process");
		
		

	}

}
