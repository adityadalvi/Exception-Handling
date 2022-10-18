
public class New1 {
	
	void m1(int num1,int num2)
	{
		
		System.out.println("gggg");
		
	}
	void m2(int num1,int num2)
	{
		
			System.out.println(num1/num2);
	}

	public static void main(String[] args) 
	{
		New1 obj=new New1();
		try 
		{
			obj.m1(10, 0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try
		{
			obj.m2(10,0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
