
public class ExceptionProapagation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		m1();
		System.out.println("out main");

	}

	private static void m1() {
		System.out.println("in m1");
		m2();
		System.out.println("out m1");
	}

	private static void m2() {
		// TODO Auto-generated method stub
		System.out.println("in m2");
		m3();
		System.out.println("out m2");
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		System.out.println("in m3");
		try
		{
			System.out.println(1/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("continue");
		}
		
		System.out.println("out m3");
		
	}

	

}
