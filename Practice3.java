
public class Practice3 
{
	void m1()
	{
		m2();
	}
	void m2()
	{
		System.out.println("s1");
		System.out.println("s2");
		try 
		{
			System.out.println("s3");
			System.out.println(45/0);//s4
			System.out.println("s5");
		} catch (Throwable A) 
		{
			System.out.println("s6");
			
		}
		System.out.println("s7");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice3 obj=new Practice3();
		obj.m1();

	}

}
