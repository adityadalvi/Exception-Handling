
public class throw1andThrows1 {
	void m1(int num1,int num2) throws Exception
	{
		if(num2!=0)
		{
			System.out.println(num1/num2);
		}
		else
		{
			throw new ArithmeticException();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw1andThrows1 obj=new throw1andThrows1();
		try 
		{
			obj.m1(10,0);
		} catch (Exception e) 
		{
			
		}
		System.out.println("Hello Aditya");
		

	}

}
