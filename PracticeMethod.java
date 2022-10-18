

public class PracticeMethod {
	void m1(int num1,int num2) 
	{
		System.out.println(1);
		try 
		{
			int num3=num1/num2;
			System.out.println(num3);
			System.out.println("Hiiiii");
		} 
		catch (Exception e) {
			System.out.println("num2=0");
		}
		finally
		{
			System.out.println("Hello Aditya");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PracticeMethod obj=new PracticeMethod();
		obj.m1(10,0);
		System.out.println("hiiiii");
	}

}
