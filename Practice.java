
public class Practice {

	void m1()
	{
		m2();
	}
	void m2()
	{
		System.out.println("Hello");
		int[] a= {1,2,3,4,5};
		System.out.println(a[5]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice obj=new Practice();
		obj.m1();
	}

}
