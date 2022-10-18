
public class ExceptionPropagation {

	public static void main(String[] args) throws Exception{
		System.out.println("in main");
		m1();
		System.out.println("out main");

	}

	private static void m1() throws Exception {
		System.out.println("in m1");
		m2();
		System.out.println("out m1");
	}

	private static void m2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in m2");
		m3();
		System.out.println("out m2");
		
	}

	private static void m3() throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("in m3");
		Thread.sleep(0);
		System.out.println("out m3");
		
	}

}
