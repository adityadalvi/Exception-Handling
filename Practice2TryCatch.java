
public class Practice2TryCatch {

	void m1()
	{
		m2();
	}
	void m2()
	{
		System.out.println("hello");
		int[] a= {1,2,3,4,5};
		
		try 
		{
			System.out.println(a[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}
		System.out.println("exit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice2TryCatch obj=new Practice2TryCatch();
		obj.m1();
	}

}
